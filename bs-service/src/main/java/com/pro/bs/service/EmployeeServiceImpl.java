package com.pro.bs.service;

import com.pro.bs.dao.EmployeeDao;
import com.pro.bs.model.EmployeeModel;

import javax.annotation.Resource;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    @Override
    public boolean login(String username, String password) {
        return employeeDao.verifyPwd(username, password) == 1;
    }

    @Override
    public List<EmployeeModel> findUserByCondition(EmployeeModel employeeBO) {
        return null;
    }

    @Override
    public Integer createUser(EmployeeModel employeeBO) {
        return null;
    }

    @Override
    public Integer updateUser(EmployeeModel employeeBO) {
        return null;
    }

    @Override
    public Integer deleteUser(Integer empId) {
        return null;
    }

}
