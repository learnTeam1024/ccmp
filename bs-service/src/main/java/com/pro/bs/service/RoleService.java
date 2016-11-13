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
        /**
         * 根据名字查询
         */
        List<RoleModel> findName(String roleName);
        /**
         *根据权利等级查询
         */
        List<RoleModel> findRank(Integer roleRank);
        /**
         * 根据 名字+权利等级
         */
        List<RoleModel> findSome(RoleModel roleModel);
    }

