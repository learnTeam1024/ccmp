package com.pro.bs.dao;

import com.pro.bs.vo.EmployeeVO;

import java.util.List;

/**
 * 用户Dao
 * Created by hzq on 2016/10/4.
 */
public interface EmployeeDao {

    Integer verifyPwd(String userName, String password);

    List<EmployeeVO> findUserByCondition();

    Integer createUser(EmployeeVO employeeVO);

    Integer updateUser(EmployeeVO employeeVO);

    Integer deleteUser(Integer empId);
}
