package com.pro.bs.model;

/**
 * Created by Administrator on 2016/10/12.
 */
public class DepartmentModel {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 部门编号
     */
    private  Integer dptNum;
    /**
     * 部门名称
     */
    private String dptName;
    /**
     * 上级部门编号
     */
    private Integer supDptnum;
    /**
     * 是否存在
     */
    private  Integer  isDelete;

    /**
     *起始
     */
    private  Integer  startRow;

    /**
     *每页显示数量
     */
    private  Integer pageSize;

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDptNum() {
        return dptNum;
    }

    public void setDptNum(Integer dptNum) {
        this.dptNum = dptNum;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public Integer getSupDptnum() {
        return supDptnum;
    }

    public void setSupDptnum(Integer supDptnum) {
        this.supDptnum = supDptnum;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
