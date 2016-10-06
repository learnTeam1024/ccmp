package com.pro.bs.user.controller;

import com.pro.bs.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * 用户管理controller
 * Created by hzq on 2016/10/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private EmployeeService employeeService;

    /**
     * 查询用户
     * @param model
     * @return
     */
    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public String queryList(Model model){
        model.addAttribute("test","test123");
        return "userList";
    }


    /**
     * 用户详情
     * @param model
     * @return
     */
    @RequestMapping(value = "/detail.do", method = RequestMethod.GET)
    public String getDetail(Model model){
        model.addAttribute("test","test123");
        return "userEdit";
    }

    /**
     * 保存用户信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    public String saveUser(Model model){
        model.addAttribute("test","test123");
        return "userEdit";
    }

    /**
     * 删除用户
     * @param model
     * @return
     */
    @RequestMapping(value = "/delete.do", method = RequestMethod.GET)
    public String deleteUser(Model model){
        model.addAttribute("test","test123");
        return "userEdit";
    }
}
