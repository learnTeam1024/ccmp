package com.pro.bs.empDep.controller;

import com.pro.bs.model.EmpDepModel;
import com.pro.bs.result.PageResult;
import com.pro.bs.result.PlainResult;
import com.pro.bs.service.DepartmentService;
import com.pro.bs.service.EmpDepService;
import com.pro.bs.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
@Controller
@RequestMapping(value = "/empDep")
public class EmpDepController {
    @Resource private EmpDepService empDepService;
    @Resource private EmployeeService employeeService;
    @Resource private DepartmentService departmentService;

    @RequestMapping(value="/index.do")
    public String allData(Model model){
        List<EmpDepModel> list= empDepService.allFind();
        if (list==null){
            return "hello";
        }
        model.addAttribute("list",list);
        return "empDepList";
    }
    @RequestMapping(value="/among.do")
    public String amon(){
        return "empDepEdit";
    }
    @RequestMapping(value="/testName.do")
    @ResponseBody
    public PlainResult testEmp(String userName){
        PlainResult result =new PlainResult();
        Integer id=employeeService.findId(userName);
        if (id==null){
            result.setMessage("没有用户信息");
        }else {
            result.setMessage("符合条件");
        }
        return result;
    }
    @RequestMapping(value="testNum.do")
    @ResponseBody
    public PageResult testNum (Integer depNum){
        PageResult result = new PageResult();
        Integer id=departmentService.findId(depNum);
        if (id==null){
            result.setMessage("没有部门信息");
        }else {
            result.setMessage("符合条件");
        }
        return result;
    }
    @RequestMapping(value="/save.do")
    public String saveEmp(EmpDepModel empDepModel){
        Integer a=empDepService.addEmpdep(empDepModel);
        if (a!=1){
            return "hello";
        }
        return  "redirect:/empDep/index.do";
    }
}
