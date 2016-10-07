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
     * 进入用户详情界面
     * @param empId 用户Id
     */
    @RequestMapping(value = "/goFormPage.do", method = RequestMethod.GET)
    public String getDetail(Model model, @RequestParam(required = false) Integer empId){

        if (empId != null) {
            //根据empId查询详情
            EmployeeModel employeeModel = employeeService.getUserDetail(empId);
            model.addAttribute("employModel", employeeModel);
        }

        return "userEdit";
    }

    /**
     * 保存用户信息(新增+修改)
     */
    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    public String saveUser(EmployeeModel employee){
        if (employee == null) {
            System.out.println("hello");
        }

        //TODO 增加参数校验

        //判断是否传入id,如果传入则认为是修改
        if(employee.getEmpId() != null){
            employeeService.updateUser(employee);
        }else {
            employeeService.createUser(employee);
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

        if (employee == null || employee.getEmpId() == null) {
            //错误码和错误信息可以自己定义,这里只是写个范例
            result.setErrorMessage(1001,"缺失参数, empId is null");
            return result;
        }

        employeeService.deleteUser(employee.getEmpId());
        result.setData(true);
        return result;

    }

}
