package com.pro.bs.service;

import com.pro.bs.model.RoleModel;

import java.util.List;

/**
 * Created by Administrator on 2016/11/2.
 */
public interface RoleService {

        /**
         * 查询所有管理员信息
         *
         * @return
         */
        List<RoleModel> findAllRole();

        /**
         * 查询单个信息
         *
         * @param roleName
         * @return
         */
        RoleModel findByname(String roleName);

        /**
         * 增加管理员
         *
         * @param roleModel
         */
        Integer adRole(RoleModel roleModel);
        /**
         * 修改管理员信息
         */
        Integer upRole(RoleModel roleModel);
        /**
         * 删除角色信息
         */
        Integer delRole(Integer id);
    }
