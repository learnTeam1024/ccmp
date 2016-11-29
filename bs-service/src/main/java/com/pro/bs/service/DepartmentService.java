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
    Integer createDpt(DepartmentModel departmentModel);

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
    Integer findCounts();
    /**
     * 分页显示
     */
   List<DepartmentModel>  depPage(DepartmentModel departmentModel);
    /**
     * 查询单个
     */
    Integer findId (Integer dptNum);
    /**
     * 根据部门查上级
     */
    Integer findUp(Integer dptNum);
    /**
     * 查询下级部门
     */
    Integer findLw(Integer supDptnum);
    /**
     * 根据名字查部门等级
     */
    Integer seekPower(Integer dptNum);
}
