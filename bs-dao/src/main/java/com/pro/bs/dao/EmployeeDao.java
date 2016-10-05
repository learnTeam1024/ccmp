package com.pro.bs.dao;

import com.pro.bs.vo.EmployeeVO;

import java.util.List;

/**
 * Created by hzq on 2016/10/4.
 */
public interface EmployeeDao {
    void test();
    //查询所有用户
    List   findAll();
    //增加用户
    void addEmp(EmployeeVO emp);
    //修改用户信息

    void alterEmp();
    //删除用户
    void delEmp(int Employee_id);
}
