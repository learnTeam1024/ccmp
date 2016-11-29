package com.pro.bs.model;

import java.util.Date;

/**
 * Created by Administrator on 2016-11-26.
 */
public class ApproveModel {
    /**
     * ID
     */
    private  Integer id;
    /**
     * 用户
     */
    private  String  peopleName;
    /**
     *物品名称
     */
    private  String  approveName;
    /**
     * 品牌
     */
    private  String approveBrand;
    /**
     * 价格
     */
    private  Integer  approvePrice;
    /**
     * 数量
     */
    private  Integer approveNum;
    /**
     * 部门领导审批
     */
    private  String firstCheck;
    /**
     * 财务专员审批
     */
    private  String secondCheck;
    /**
     * 财务主管审批
     */
    private  String threeCheck;
    /**
     * 审批结果
     */
    private  String  allCheck;

    public String getThreeCheck() {
        return threeCheck;
    }

    public void setThreeCheck(String threeCheck) {
        this.threeCheck = threeCheck;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 申请时间
     */
    private  Date    createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public String getApproveName() {
        return approveName;
    }

    public void setApproveName(String approveName) {
        this.approveName = approveName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getApproveBrand() {
        return approveBrand;
    }

    public void setApproveBrand(String approveBrand) {
        this.approveBrand = approveBrand;
    }

    public Integer getApprovePrice() {
        return approvePrice;
    }

    public void setApprovePrice(Integer approvePrice) {
        this.approvePrice = approvePrice;
    }

    public Integer getApproveNum() {
        return approveNum;
    }

    public void setApproveNum(Integer approveNum) {
        this.approveNum = approveNum;
    }

    public String getFirstCheck() {
        return firstCheck;
    }

    public void setFirstCheck(String firstCheck) {
        this.firstCheck = firstCheck;
    }

    public String getSecondCheck() {
        return secondCheck;
    }

    public void setSecondCheck(String secondCheck) {
        this.secondCheck = secondCheck;
    }

    public String getAllCheck() {
        return allCheck;
    }

    public void setAllCheck(String allCheck) {
        this.allCheck = allCheck;
    }

    public Date getCreateTimeTime() {
        return createTime;
    }

    public void setCreateTimeTime(Date creatTime) {
        this.createTime = createTime;
    }
}
