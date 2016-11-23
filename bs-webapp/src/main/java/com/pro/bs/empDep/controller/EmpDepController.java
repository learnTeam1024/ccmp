package com.pro.bs.empDep.controller;

import com.pro.bs.model.EmpDepModel;
import com.pro.bs.result.PageResult;
import com.pro.bs.result.PlainResult;
import com.pro.bs.service.DepartmentService;
import com.pro.bs.service.EmpDepService;
import com.pro.bs.service.EmployeeService;
import org.springframework.http.client.support.HttpRequestWrapper;
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

    /**
     * 未写完的一项  降职+下拉选
     * @return
     */
//    @RequestMapping(value="/box.do")
//    @ResponseBody
//    public PlainResult box(Integer id){
//        PlainResult result =new PlainResult();
//       Integer depNum=empDepService.findNum(id);
//        List<Integer> lt=departmentService.findLw(depNum);
//        result.setData(lt);
//        return result;
//    }

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
    public PlainResult testNum (Integer depNum){
        PlainResult result = new PlainResult();
        Integer id=departmentService.findId(depNum);
        if (id==null){
            result.setMessage("没有部门信息");
        }else {
            result.setMessage("符合条件");
        }
        return result;
    }
    @RequestMapping(value="/save.do")
    public String saveEmp(EmpDepModel empDepModel,Model model){
        Integer a=empDepService.addEmpdep(empDepModel);
        Integer supDptnum=empDepModel.getDepNum();
        List<Integer>lt=departmentService.findLw(supDptnum);
        model.addAttribute("lt",lt);
        if (a!=1){
            return "hello";
        }
        return  "redirect:/empDep/index.do";
    }
    @RequestMapping(value="/promo.do")
    @ResponseBody
    public PlainResult promo(Integer id) {
        EmpDepModel empDepModel=new EmpDepModel();
        PlainResult result =new PlainResult();
        if (id == null) {
            result.setMessage("没有这个用户");
            return result;
        } else {
            Integer dep_num = empDepService.findNum(id);
            Integer supNum=departmentService.findUp(dep_num);
            if (supNum==null){
                result.setMessage("没有上级部门");
                return result;
            }else{
                empDepModel.setId(id);
                empDepModel.setDepNum(supNum);
                empDepService.upNum(empDepModel);
                result.setCode(supNum);
                return result;
            }
        }
    }
    @RequestMapping(value="/demo.do")
    @ResponseBody
    public PlainResult demo(Integer id){
        PlainResult result=new PlainResult();
        EmpDepModel empDepModel=new EmpDepModel();
        return result;
    }
    @RequestMapping(value="/delete.do")
    @ResponseBody
    public PlainResult delete(Integer id){
        PlainResult result =new PlainResult();
        Integer a=empDepService.deleteEmp(id);
        if (a!=1){
            result.setMessage("false");
        }
        result.setMessage("success");
        return  result;
    }
}
