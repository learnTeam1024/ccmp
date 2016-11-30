package com.pro.bs.service;

import com.pro.bs.model.ApproveModel;

import java.util.List;

/**
 * Created by Administrator on 2016-11-26.
 */
public interface ApproveService {
    /**
     * 新增申请
     */
    Integer addApp (ApproveModel approveModel);
    /**
     * 查询申请
     */
    List<ApproveModel>findAll(String peopleName);
    /**
     * 部门领导审批
     */
    List<ApproveModel>findOne(String peopleName);
    /**
     * 部门领导同意
     */
    Integer agr(Integer id);
    /**
     * 部门领导不同意
     */
    Integer refu(Integer id);
    /**
     * 财务会计同意
     */
    Integer agreeSec(Integer id);
    /**
     * 财务会计不同意
     */
    Integer refuseSec(Integer id);
    /**
     * 财务主管同意
     */
    Integer agreeThr(Integer id);
    /**
     * 财务主管不同意
     */
    Integer refuseThr(Integer id);
    /**
     * 部门领导待审批列表
     */
    List<ApproveModel> findDu(Integer supDptnum);
    /**
     * 财务专员待审批列表
     */
    List<ApproveModel> findSeco();
    /**
     * 财务主管审批列表
     */
    List<ApproveModel>findThr();
}
