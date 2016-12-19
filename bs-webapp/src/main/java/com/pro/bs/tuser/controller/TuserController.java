package com.pro.bs.tuser.controller;

import com.pro.bs.model.TuserModel;
import com.pro.bs.result.BaseResult;
import com.pro.bs.service.TuserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016-12-18.
 */
@Controller
@RequestMapping(value="/tuser")
public class TuserController {
    @Resource  private TuserService tuserService;
    @RequestMapping("/index.do")
    public String finds(Model model){
        List<TuserModel>list=tuserService.finds();
        model.addAttribute("list",list);
        return "user/tuserList";
    }
    @RequestMapping(value="/add.do")
    public  String adds(TuserModel tuserModel,Integer id){
        if (tuserModel.getId()!=null){
            Integer c=tuserService.update(tuserModel);
        }else {
            Integer a=tuserService.adds(tuserModel);
            if (a!=1){
                return "hello";
            }
        }
        return "redirect:/tuser/index.do";
    }
    @RequestMapping(value="find.do")
    public  String upda(Integer id,Model model){
        TuserModel tuserModel=tuserService.find(id);
        model.addAttribute("tu",tuserModel);
        return "user/tuserUpdate";

    }
    @RequestMapping(value="/delete.do")
    @ResponseBody
    public BaseResult delete(Integer id) {
        BaseResult result=new BaseResult();
        if (id==null){
            result.setMessage("无此信息");
            return result;
        }
        Integer a = tuserService.delete(id);
        if (a != 1) {
            result.setMessage("删除失败");
            return result;
        }
        result.setMessage("删除成功");
        return result;
    }
    @RequestMapping(value="/finds.do")
    public String fi(String staffId,Model model){
        List<TuserModel>list=tuserService.findz(staffId);
        model.addAttribute("list",list);
        return "user/tuserList";
    }
}
