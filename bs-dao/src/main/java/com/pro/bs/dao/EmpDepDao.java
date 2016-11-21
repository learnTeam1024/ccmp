package com.pro.bs.dao;

import com.pro.bs.model.EmpDepModel;

import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
public interface EmpDepDao {
    /**
     * 查找全部员工职位信息
     */
    List<EmpDepModel> findAll ();
    /**
     * 增加员工职位信息
     */
    Integer addEmp (EmpDepModel empDepModel);
}
