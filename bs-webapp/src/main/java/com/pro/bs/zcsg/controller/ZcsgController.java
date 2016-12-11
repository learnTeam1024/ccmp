package com.pro.bs.zcsg.controller;

import com.pro.bs.model.ZcsgModel;
import com.pro.bs.service.ZcsgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping(value="/save.do")
    public String add(ZcsgModel zcsgModel){
        Integer a=zcsgService.addOne(zcsgModel);
        if (a==1){
            return  "redirect:/zcsg/index.do";
        }
        return "hello";
    }
}
