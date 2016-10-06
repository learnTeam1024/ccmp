package com.pro.bs.model;

import java.util.Date;

/**
 * 用户Model
 * Created by hzq on 2016/10/4.
 */
public class EmployeeModel{
    /**
     *主键Id
     */
    private Integer empId;
    /**
     * 用户登录名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 年龄
     */
    private Integer age;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 姓名
     */
    private String realName;
    /**
     * 性别
     */
    private Integer gender;

    /**
     * 是否删除
     */
    private Integer isDelete;

    private Date createTime;
    private Date updateTime;
    private Date deleteTime;


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
