package com.pro.bs.department.controller;

import com.pro.bs.model.DepartmentModel;
import com.pro.bs.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
@Controller
@RequestMapping(value = "/dept")
public class testController {


    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value ="/index.do")
    public  String findAll(ModelMap model){
        List<DepartmentModel> list=departmentService.findAll();
        model.put("list",list);
        return  "deptList";
    }
    @RequestMapping(value = "/aaa.do")
    public String cc(ModelMap model, Integer dptNum){
        DepartmentModel departmentModel=departmentService.findByDptnum(dptNum);
        model.put("departmentModel",departmentModel);
        return "aaa";
    }

    @RequestMapping(value = "/save.do")
    public String saveDepartment(int dptNum,String dptName,int supDptnum){
        Integer a=departmentService.createDpt(dptNum,dptName,supDptnum);
        return  "redirect:/dept/index.do";
    }




}