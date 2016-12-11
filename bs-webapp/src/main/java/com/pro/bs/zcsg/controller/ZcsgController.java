package com.pro.bs.zcsg.controller;

import com.pro.bs.model.ZcsgModel;
import com.pro.bs.result.BaseResult;
import com.pro.bs.service.ZcsgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016-12-09.
 */
@Controller
@RequestMapping (value="/zcsg")
public class ZcsgController {
    @Resource private ZcsgService zcsgService;
    @RequestMapping(value="/index.do")
    public String showAll(Model model){
        List<ZcsgModel>list=zcsgService.finds();
        model.addAttribute("list",list);
        return "zcsgInfo";
    }
    @RequestMapping(value="findOne.do")
    public String find(Integer id,Model model){
        ZcsgModel zcsgModel=zcsgService.findOnee(id);
        if (zcsgModel!=null){
            model.addAttribute("zcsg",zcsgModel);
            return "zcsgEdit";
        }
        return "hello";
    }
    @RequestMapping(value="/save.do")
    public String add(ZcsgModel zcsgModel,Integer id) {
        if (id != null) {
            Integer a=zcsgService.upOne(zcsgModel);
            return "redirect:/zcsg/index.do";
        } else {
            Integer a = zcsgService.addOne(zcsgModel);
            if (a == 1) {
                return "redirect:/zcsg/index.do";
            }
            return "hello";
        }
    }
    @RequestMapping(value="/delete.do")
    @ResponseBody
    public BaseResult delet(Integer id){
        BaseResult result=new BaseResult();
        if (id==null){
            result.setMessage("无此信息");
            return  result;
        }
        Integer a=zcsgService.delete(id);
        if (a!=1){
            result.setMessage("删除失败");
            return result;
        }
        result.setMessage("删除成功");
        return result;
    }
    @RequestMapping(value="/findByAss.do")
    public String finds(String assetnm,Model model){
        List<ZcsgModel>list=zcsgService.findByAssetnm(assetnm);
        model.addAttribute("list",list);
        return "zcsgInfo";
    }
}
