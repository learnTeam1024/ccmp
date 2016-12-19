package com.pro.bs.dao;

import com.pro.bs.model.TuserModel;

import java.util.List;

/**
 * Created by Administrator on 2016-12-18.
 */
public interface TuserDao {
    /**
     * 查出所有员工信息
     */
    List<TuserModel>finds();
    /**
     * 添加新员工
     */
    Integer add(TuserModel tuserModel);
    /**
     * 查找单个员工信息
     */
    TuserModel find(Integer id);
    /**
     * 修改员工信息
     */
    Integer update(TuserModel tuserModel);
    /**
     * 删除员工
     */
    Integer delete(Integer id);
    /**
     * 查找对应员工信息
     */
    List<TuserModel> findc(String staffId );
}
