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
   public List<RoleModel> findAllRole(){
       List<RoleModel> list=roleDao.findAll();
       return list;
   }

    public   Integer adRole(RoleModel roleModel){
        if (roleModel==null){
            return 2;
        }
        Integer a=roleDao.addRole(roleModel);
        if (a<1){
            return  2;
        }
        return a;

    }

    @Override
    public Integer upRole(RoleModel roleModel) {
        if (roleModel==null){
            return 2;
        }
       Integer a= roleDao.updateRole(roleModel);
        return a;
    }

    @Override
    public Integer delRole(Integer id) {
        if (id==null){
            return 2;
        }
        Integer a=roleDao.deleteRole(id);
        return a;
    }

    public List<RoleModel> findName(String roleName) {
        List<RoleModel>list=roleDao.findByName(roleName);
        return list;
    }

    public List<RoleModel> findRank(Integer roleRank) {
        List<RoleModel>list=roleDao.findByRank(roleRank);
        return list;
    }

    public List<RoleModel> findSome(RoleModel roleModel) {
        List<RoleModel>list=roleDao.findBySome(roleModel);
        return list;
    }

    @Override
    public List<RoleModel> findDes(RoleModel roleModel) {
        List<RoleModel>list=roleDao.desFind(roleModel);
        return list;
    }

    @Override
    public Integer countAll() {
        Integer allCount=roleDao.allCount();
        return allCount;
    }

    ;
}
