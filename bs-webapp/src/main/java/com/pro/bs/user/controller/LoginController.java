package com.pro.bs.user.controller;

import com.pro.bs.model.EmployeeModel;
import com.pro.bs.service.DepartmentService;
import com.pro.bs.service.EmpDepService;
import com.pro.bs.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.*;

/**
 * 登录controller
 * Created by hzq on 2016/10/4.
 */
@Controller
public class LoginController extends HttpServlet{

    @Resource
    private EmployeeService employeeService;
    @Resource
    private EmpDepService empDepService;
    @Resource
    private DepartmentService departmentService;

    /**
     * 登录
     */
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String login ( EmployeeModel employeeModel, HttpServletRequest req){
        boolean a= employeeService.login(employeeModel.getUserName(),employeeModel.getUserPwd());
        HttpSession session=req.getSession();
        session.setAttribute("name",employeeModel.getUserName());
        Integer depNum=empDepService.seDep(employeeModel.getUserName());
        Integer dptPower=departmentService.seekPower(depNum);
        session.setAttribute("dptPower",dptPower);
        if (a){
            return "index";
        }
        return "hello";
    }
}
