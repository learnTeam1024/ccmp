package com.pro.bs.service;

import com.pro.bs.dao.RoleDao;
import com.pro.bs.model.RoleModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/3.
 */
@Service("roleService")
public class RoleServiceImpl implements  RoleService {
    @Resource private RoleDao roleDao;
   public List<RoleModel> findAll(){
       List<RoleModel> list=roleDao.findAll();
       return list;
   }
    public  RoleModel findByname(String roleName){
     return null;
    }
    public   Integer addRole(RoleModel roleModel){
        if (roleModel==null){
            return 2;
        }
        Integer a=roleDao.addRole(roleModel);
        if (a<1){
            return  2;
        }
        return a;

    };
}
