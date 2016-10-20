package com.pro.bs.dao;

import com.pro.bs.model.DepartmentModel;

import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
public interface DepartmentDao {
     /**
     * 查询部门信息
     */
     List findAll();

    /**
     * 根据编号查询部门
     */
    DepartmentModel findByDptnum (Integer dptNum);

    /**
     * 新增部门
     */
    Integer cteateDpt(DepartmentModel depatmentModel);

    /**
     * 更新部门信息
     */
    void updateDpt(DepartmentModel departmentModel);

    /**
     * 逻辑删除部门
     */

    Integer deleteDpt (Integer dptNum);
}

