package com.pro.bs.role.controller;

import com.pro.bs.model.RoleModel;
import com.pro.bs.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {
    @Resource private RoleService roleService;
    @RequestMapping(value ="/index.do")
    public String findAll(Model model){
        List<RoleModel> list =roleService.findAll();
        model.addAttribute("list",list);
        if (list==null){
            return "hello";
        }
       return "roleList";
    }
    @RequestMapping(value="/save.do")
    public  String addRole(RoleModel roleModel){
        if (roleModel==null){
            return "hello";
        }
       Integer a= roleService.addRole(roleModel);
        if (a==2){
            return "hello";
        }
        return "redirect:/role/index.do";
    }
}
