package com.pro.bs.department.controller;

import com.pro.bs.model.DepartmentModel;
import com.pro.bs.result.PlainResult;
import com.pro.bs.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
@Controller
@RequestMapping(value = "/dept")
public class deptController {


    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value ="/index.do")
    public  String findAll(ModelMap model){
        List<DepartmentModel> list=departmentService.findAll();
        model.put("list",list);
        return  "deptList";
    }

    /**
     * 跳转增添页面
     * @return
     */
    @RequestMapping(value = "/aaa.do", method = RequestMethod.GET)
    public String updateDep(Model model ,Integer id){
             if(id==null) {
             return "hello";
        }
        model.addAttribute("id",id);
        return "deptEdit";
    }
    /**
     * 增添部门
     * @param
     * @return
     */

    @RequestMapping(value = "/save.do")

    public String saveDepartment(int dptNum,String dptName,int supDptnum,Integer id){
       if (id==null) {
           Integer a = departmentService.createDpt(dptNum, dptName, supDptnum);
           return  "redirect:/dept/index.do";
       }
        departmentService.updateDpt(id,dptNum, dptName,supDptnum);
        return  "redirect:/dept/index.do";
    }

    /**
     * 删除部门
     * @param departmentModel
     * @return
     */
    @RequestMapping(value="/delete.do")
    @ResponseBody
    public  PlainResult<Boolean>deleteDept(DepartmentModel departmentModel){
        PlainResult<Boolean> result = new PlainResult<>();

        if (departmentModel == null || departmentModel.getId()== null) {
            result.setMessage("缺失参数, 无此ID");
            return result;
        }
        departmentService.deleteDpt(departmentModel.getId());
        result.setData(true);
        result.setMessage("删除成功");
        return  result;

    }
    /**
     * 查询部门
     * @param
     * @return
     */
     @RequestMapping(value = "/findBynum.do")

     public String findBynum(Model model,Integer dptNum){
         DepartmentModel departmentModel=departmentService.findByDptnum(dptNum);
         model.addAttribute("departmentModel",departmentModel);
         return "deptOne";


     }


}
