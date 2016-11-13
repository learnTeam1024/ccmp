package com.pro.bs.dao;

import com.pro.bs.model.RoleModel;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */

public interface RoleDao {
    /**
     * 查询所有管理员信息
     * @return
     */
    List<RoleModel> findAll();

    /**
     * 查询单个信息
     * @param roleName
     * @return
     */
    RoleModel findByname(String roleName);

    /**
     * 增加管理员
     * @param roleModel
     */
    Integer addRole(RoleModel roleModel);
    /**
     * 修改管理员信息
     */
    Integer updateRole(RoleModel roleModel);
    /**
     * 删除角色信息
     */
    Integer deleteRole(Integer id);
}
