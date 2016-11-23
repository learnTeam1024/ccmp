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
    /**
     * 查询部门数量
     */
    Integer findCount();
    /**
     * 分页查询
     */
     List<DepartmentModel> findDep (DepartmentModel departmentModel);
    /**
     * 查询单个
     */
    Integer findOne(Integer dptNum);
    /**
     * 查询上级部门
     */
    Integer findSup (Integer dptNum);
    /**
     * 查询下级部门
     */
    List<Integer>findLow(Integer supDptnum);
}

