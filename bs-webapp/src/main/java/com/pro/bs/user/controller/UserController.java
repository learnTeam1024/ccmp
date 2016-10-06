package com.pro.bs.user.controller;

import com.pro.bs.model.EmployeeModel;
import com.pro.bs.model.EmployeeParam;
import com.pro.bs.result.PageResult;
import com.pro.bs.result.PlainResult;
import com.pro.bs.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

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
     * 跳转到用户首页
     */
    @RequestMapping("/index.do")
    public String userIndex(){
        return "userList";
    }

    /**
     * 查询用户
     * @param queryParam
     */
    @RequestMapping(value = "/list.do")
    public String queryList(Model model, EmployeeParam queryParam){
        //初始化分页信息
        if (queryParam == null) {
            queryParam = new EmployeeParam();
        }

        PageResult<EmployeeModel> pageResult = new PageResult<>();

        //存放页面数据
        model.addAttribute("pageResult", pageResult);

        //获取符合条件的用户总数
        Integer totalCount = employeeService.countUserByCondition(queryParam);
        pageResult.setTotalItem(totalCount);

        //如果没有符合条件的用户则直接返回
        if (totalCount == 0) {
            return "userList_page";
        }

        //获取符合条件的用户列表
        List<EmployeeModel> employeeModels = employeeService.findUserByCondition(queryParam);
        pageResult.setData(employeeModels);

        //设置pageSize
        pageResult.setPageSize(queryParam.getPageSize());

        return "userList_page";
    }


    /**
     * 用户详情
     * @param model
     * @return
     */
    @RequestMapping(value = "/goFormPage.do", method = RequestMethod.GET)
    public String getDetail(Model model, @RequestParam(required = false) Integer empId){

        if (empId != null) {
            //TODO 根据empId查询详情,并设置到attribute

            EmployeeModel employeeModel = new EmployeeModel();
            employeeModel.setUserName("abc");
            model.addAttribute("employModel", employeeModel);
        }

        return "userEdit";
    }

    /**
     * 保存用户信息
     * @param
     * @return
     */
    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    public String saveUser(EmployeeModel employee){
        if (employee == null) {
            System.out.println("hello");
        }
       Integer ss= employeeService.createUser(employee);
        if (ss==null){
            System.out.println("hello");
        }
        return "redirect:/user/index.do";
    }

    /**
     * 删除用户
     */
    @RequestMapping(value = "/delete.do", method = RequestMethod.POST)
    @ResponseBody
    public PlainResult<Boolean> deleteUser(EmployeeParam employee){
        PlainResult<Boolean> result = new PlainResult<>();
        System.out.println(employee.getEmpId());
        result.setData(true);
        return result;

    }
}
