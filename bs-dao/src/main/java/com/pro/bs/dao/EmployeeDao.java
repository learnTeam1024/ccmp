package com.pro.bs.dao;

import com.pro.bs.vo.EmployeeVO;

import java.util.List;

/**
 * Created by hzq on 2016/10/4.
 */
public interface EmployeeDao {

    List<EmployeeVO> findNormalEmps();

    Integer createUser(EmployeeVO employeeVO);

    Integer updateUser(EmployeeVO employeeVO);

    Integer deleteUser(Integer empId);
}
