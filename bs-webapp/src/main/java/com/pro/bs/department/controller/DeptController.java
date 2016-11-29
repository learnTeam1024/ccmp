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
public class DeptController {

    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value ="/index.do")
    public  String findAll(Model model){
        DepartmentModel departmentModel=new DepartmentModel();
        int totalPage=0;
        departmentModel.setPageSize(3);
        departmentModel.setStartRow(0);
        Integer allCounts=departmentService.findCounts();
        if (allCounts%departmentModel.getPageSize()==0){
            totalPage=allCounts/departmentModel.getPageSize();
        }
        else{
            totalPage=(int)Math.ceil(allCounts/departmentModel.getPageSize()+1);
        }
        model.addAttribute("totalPage",totalPage);
        model.addAttribute("currentPage",1);
        List<DepartmentModel>list=departmentService.depPage(departmentModel);
        model.addAttribute("list",list);
        if (list==null){
            return "hello";
        }
        return "deptList";

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

    public String saveDepartment(DepartmentModel departmentModel){
       if (departmentModel.getId()==null) {
           Integer a = departmentService.createDpt(departmentModel);
           return  "redirect:/dept/index.do";
       }
        departmentService.updateDpt(departmentModel);
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
         if(departmentModel==null){
             model.addAttribute("result","无查询结果");
             return "hello";
         }
         model.addAttribute("departmentModel",departmentModel);
         return "deptOne";


     }
    /**
     * 分页功能的实现
     */
    @RequestMapping(value="listDepartment.do")
    public  String depPage(Model model,Integer currentPage){
        Integer totalPage=0;
        DepartmentModel departmentModel=new DepartmentModel();
        departmentModel.setPageSize(3);
        departmentModel.setStartRow((currentPage-1)*departmentModel.getPageSize());
        List<DepartmentModel>list=departmentService.depPage(departmentModel);
        model.addAttribute("list",list);
        model.addAttribute("currentPage",currentPage);

        Integer allCounts=departmentService.findCounts();
        if (allCounts%departmentModel.getPageSize()==0){
            totalPage=allCounts/departmentModel.getPageSize();
        }
        else{
            totalPage=(int)Math.ceil(allCounts/departmentModel.getPageSize()+1);
        }
        model.addAttribute("totalPage",totalPage);
        return "deptList";
    }


}
