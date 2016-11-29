package com.pro.bs.role.controller;

import com.pro.bs.model.RoleModel;
import com.pro.bs.result.BaseResult;
import com.pro.bs.result.PageResult;
import com.pro.bs.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.List;

/**
 * 展现管理全部信息
 * Created by Administrator on 2016/11/3.
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController  {
    @Resource private RoleService roleService;
    @RequestMapping(value ="/index.do")
    public String findAll(Model model){
        int totalPage=0;
        PageResult pr=new PageResult();
        Integer allCount =roleService.countAll();
        pr.setPageSize(4);
        if (allCount%pr.getPageSize()!=0){
            totalPage=(int)Math.ceil(allCount/pr.getPageSize())+1;
        }
        else {
             totalPage=(int)Math.ceil(allCount/pr.getPageSize());
        }

        pr.setTotalPage(totalPage);// currentPage totalPage
        model.addAttribute("totalPage",totalPage);
        model.addAttribute("currentPage",1);
        RoleModel model1=new RoleModel();
        model1.setStartRow(0);
        model1.setPageSize(pr.getPageSize());
        List<RoleModel>list=roleService.findDes(model1);


//        List<RoleModel> list =roleService.findAllRole();
          model.addAttribute("list",list);
        if (list==null){
            return "hello";
        }
       return "roleList";
    }

    /**
     * 增加管理员
     * @param roleModel
     * @return
     */
    @RequestMapping(value="/save.do")
    public  String addRole(RoleModel roleModel){
        if (roleModel==null){
            return "hello";
        }
//        if (roleModel.getId()==5){
//            return "hello";
//        }
        if (roleModel.getId()==null) {
            Integer a = roleService.adRole(roleModel);
            if (a == 2) {
                return "hello";
            }
            return "redirect:/role/index.do";
        }
        /**
         * 需改管理员信息
         * @param id
         * @return
         */

        Integer a= roleService.upRole(roleModel);
        if (a!=1){
            return "hello";
        }
        return "redirect:/role/index.do";
    }
    /**
     *
     *
     */
    @RequestMapping(value="/judge.do")
    public String judge(Model model, Integer id){
            model.addAttribute("id",id);
            return "roleEdit";

    }
    /**
     * 删除角色信息
     */
    @RequestMapping(value="delete.do")
    @ResponseBody
    public BaseResult execute(Integer id){
        BaseResult result=new BaseResult();
        if (id==null){
            result.setMessage("无效ID");
            return  result;
        }
       Integer a= roleService.delRole(id);
        if (a!=1){
            result.setMessage("删除失败");
            return result;
        }
        result.setMessage("删除成功");
        return result;
    }
    /**
     * 根据所给条件分情况查询
     */
    @RequestMapping(value="/findBySome.do")
    public String findResult(Model model,RoleModel roleModel){
        String roleName=roleModel.getRoleName();
        Integer roleRank=roleModel.getRoleRank();
        if (roleRank==-1 & roleName==""){
            return "hello";
        }
        if (roleName==""){
            List<RoleModel>list=roleService.findRank(roleRank);
            model.addAttribute("list",list);
            return "roleList";
        }
        if (roleRank==-1){
            List<RoleModel>list=roleService.findName(roleName);
            model.addAttribute("list",list);
            return "roleList";
        }
        List<RoleModel>list=roleService.findSome(roleModel);
        model.addAttribute("list",list);
        return "roleList";


    }
    /**
     * 分页查询
     */
    @RequestMapping(value="/ListRole.do")
    public String findDe(RoleModel roleModel,Model model,Integer currentPage){//startRow  pageSize
        int totalPage=0;
        roleModel.setPageSize(4);
        roleModel.setStartRow((currentPage-1)*roleModel.getPageSize());

        PageResult pr=new PageResult();
        Integer allCount =roleService.countAll();
        pr.setPageSize(4);
        if (allCount%roleModel.getPageSize()!=0){
            totalPage=(int)Math.ceil(allCount/roleModel.getPageSize()+1);
        }
        if (allCount%roleModel.getPageSize()==0){
            totalPage=(int)Math.ceil(allCount/roleModel.getPageSize());
        }
        List<RoleModel>list=roleService.findDes(roleModel);
        model.addAttribute("list",list);
        model.addAttribute("totalPage",totalPage);
        model.addAttribute("currentPage",currentPage);

        return "roleList";
    }

    /**
     * 测试
     */
    @RequestMapping(value="/qqq.do")
    public String qqq(Model model,RoleModel roleModel){
       Integer a= roleModel.getRoleRank();
       String b=roleModel.getRoleName();
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        return "hello";

    }


}
