package com.pro.bs.approve.controller;

import com.pro.bs.model.ApproveModel;
import com.pro.bs.result.PlainResult;
import com.pro.bs.service.ApproveService;
import com.pro.bs.service.DepartmentService;
import com.pro.bs.service.EmpDepService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016-11-26.
 */
@Controller
@RequestMapping(value="/approve")
public class ApproveController {
    @Resource
    private   ApproveService approveService;
    @Resource
    private   EmpDepService  empDepService;
    @Resource
    private   DepartmentService departmentService;
    @RequestMapping(value="/index.do")
    public  String all(HttpSession session,Model model){
        String name=(String) session.getAttribute("name");
        return "menu";
    }
    @RequestMapping(value="/save.do")
    public String savee(ApproveModel approveModel,HttpSession session){
        String name=(String) session.getAttribute("name");
        approveModel.setPeopleName(name);
        approveModel.setThreeCheck("等待审批");
        if (approveModel.getApprovePrice() * approveModel.getApproveNum()<3000){
            approveModel.setThreeCheck("审批通过");
        }
       Integer a=approveService.addApp(approveModel);
        if (a!=1){
            return "hello";
        }
        return  "redirect:/approve/index.do";
    }
    @RequestMapping(value="/seeks.do")
    public String finds(HttpSession session,Model model){
        String name=(String)session.getAttribute("name");
        List<ApproveModel>list=approveService.findAll(name);
        model.addAttribute("list",list);
        return "applyList";
    }
    @RequestMapping(value="/findOne.do")
    public  String finde(Model model,HttpSession session){
        String name =(String)session.getAttribute("name");
        Integer supNum=empDepService.seDep(name);
        List<ApproveModel>lltt=approveService.findDu(supNum);
        model.addAttribute("lltt",lltt);
        return  "depList";
    }
    @RequestMapping(value="/agree.do")
    @ResponseBody
    public PlainResult agg(Integer id){
        PlainResult result=new PlainResult();
        Integer a=approveService.agr(id);
        if (a==1){
            result.setMessage("审批成功");
            return  result;
        }
        result.setMessage("审批出现错误");
        return  result;
    }
    @RequestMapping(value="/refuse.do")
    @ResponseBody
    public PlainResult ref(Integer id){
        PlainResult result=new PlainResult();
        Integer a=approveService.refu(id);
        if (a==1){
            result.setMessage("审批成功");
            return  result;
        }
        result.setMessage("审批出现错误");
        return  result;

    }
}
