package com.pro.bs.dao;

import com.pro.bs.model.ApproveModel;

import java.util.List;

/**
 * Created by Administrator on 2016-11-26.
 */
public interface ApproveDao {
    /**
     *新建申请
     */
    Integer save(ApproveModel approveModel);
    /**
     * 查询申请
     */
    List<ApproveModel> refer(String peopleName);
    /**
     * 部门领导审批
     */
    List<ApproveModel> findDep(String peopleName);
    /**
     * 部门领导同意
     */
    Integer agree(Integer id);
    /**
     * 部门领导不同意
     */
    Integer refuse(Integer id);
    /**
     * 财务会计同意
     */
    Integer agreeSecond(Integer id);
    /**
     * 财务会计不同意
     */
    Integer refuseSecond(Integer id);
    /**
     * 财务主管同意
     */
    Integer agreeThree(Integer id);
    /**
     * 财务主管不同意
     */
    Integer refuseThree(Integer id);
    /**
     * 部门领导待审批列表
     */
    List<ApproveModel>finds(Integer supDptnum);
    /**
     * 财务专员待审批列表
     */
    List<ApproveModel>findSec();
    /**
     * 财务主管待审批列表
     */
    List<ApproveModel>findThree();
}
