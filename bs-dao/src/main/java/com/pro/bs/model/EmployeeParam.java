package com.pro.bs.model;

import com.pro.bs.query.PageQueryModel;

import java.util.Date;

/**
 * 用户查询参数
 * Created by hzq on 2016/10/4.
 */
public class EmployeeParam extends PageQueryModel {
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

}
