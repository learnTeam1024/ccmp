package com.pro.bs.service;

import com.pro.bs.bo.EmployeeBO;
import com.pro.bs.dao.EmployeeDao;

import javax.annotation.Resource;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    @Override
    public boolean login(String username, String password) {
        employeeDao.verifyPwd(username, password);
        return false;
    }

    @Override
    public List<EmployeeBO> findUserByCondition(EmployeeBO employeeBO) {
        return null;
    }

    @Override
    public Integer createUser(EmployeeBO employeeBO) {
        return null;
    }

    @Override
    public Integer updateUser(EmployeeBO employeeBO) {
        return null;
    }

    @Override
    public Integer deleteUser(Integer empId) {
        return null;
    }

}
