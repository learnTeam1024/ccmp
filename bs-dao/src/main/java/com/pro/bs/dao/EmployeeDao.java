package com.pro.bs.dao;

import com.pro.bs.vo.EmployeeVO;

import java.util.List;

/**
 * 用户Dao
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

    Integer verifyPwd(String userName, String password);

    List<EmployeeVO> findUserByCondition();

    Integer createUser(EmployeeVO employeeVO);

    Integer updateUser(EmployeeVO employeeVO);

    Integer deleteUser(Integer empId);

}
