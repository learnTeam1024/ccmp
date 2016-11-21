package com.pro.bs.service;

import com.pro.bs.model.DepartmentModel;

import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
public interface DepartmentService {

    /**
     * 查询部门信息
     */
    List<DepartmentModel> findAll();

    /**
     * 根据编号查询部门
     */
    DepartmentModel findByDptnum (Integer dptNum);

    /**
     * 新增部门
     */
    Integer createDpt(int dtpNum,String dptName,int supDptnum);

    /**
     * 更新部门信息
     */
    void updateDpt(Integer id,int dptNum,String dptName,int supDptnum);

    /**
     * 逻辑删除部门
     */
    Integer deleteDpt (Integer dptNum);
    /**
     * 查询部门数量
     */
    Integer findCounts();
    /**
     * 分页显示
     */
   List<DepartmentModel>  depPage(DepartmentModel departmentModel);
    /**
     * 查询单个
     */
    Integer findId (Integer dptNum);
}
