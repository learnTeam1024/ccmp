package com.pro.bs.user.controller;

import com.pro.bs.service.EmployeeService;
import com.pro.bs.vo.EmployeeVO;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * 用户管理controller
 * Created by hzq on 2016/10/4.
 */
@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @RequestMapping("/hello.do")
    @ResponseBody
    public ModelAndView execute(){

     ModelAndView mv=new ModelAndView();
        mv.setViewName("hello.jsp");
        java.util.List<EmployeeVO> list= employeeService.findAll();
        mv.addObject("employeelist",list);
        return  mv;
    }
}
