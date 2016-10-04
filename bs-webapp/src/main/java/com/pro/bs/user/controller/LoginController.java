package com.pro.bs.user.controller;

import com.pro.bs.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * 登录controller
 * Created by hzq on 2016/10/4.
 */
@Controller
public class LoginController {

    @Resource
    private EmployeeService employeeService;

    /**
     * 登录
     */
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String login(Model model){

        employeeService.login("admin","123456");

        model.addAttribute("message","hello");
        return "main";
    }
}
