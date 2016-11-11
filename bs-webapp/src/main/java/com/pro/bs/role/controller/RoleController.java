package com.pro.bs.role.controller;

import com.pro.bs.model.RoleModel;
import com.pro.bs.result.BaseResult;
import com.pro.bs.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.List;

/**
 * 展现管理全部信息
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

    /**
     * 增加管理员
     * @param roleModel
     * @return
     */
    @RequestMapping(value="/save.do")
    public  String addRole(RoleModel roleModel){
        if (roleModel==null){
            return "hello";
        }
        if (roleModel.getId()==null) {
            Integer a = roleService.addRole(roleModel);
            if (a == 2) {
                return "hello";
            }
            return "redirect:/role/index.do";
        }
        /**
         * 需改管理员信息
         * @param id
         * @return
         */

        Integer a= roleService.updateRole(roleModel);
        if (a!=1){
            return "hello";
        }
        return "redirect:/role/index.do";
    }
    /**
     *
     */
    @RequestMapping(value="/judge.do")
    public String judge(Model model, Integer id){
            model.addAttribute("id",id);
            return "roleEdit";

    }


}
