package com.pro.bs.service;

import com.pro.bs.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import com.pro.bs.model.EmployeeModel;
import com.pro.bs.model.EmployeeParam;

import javax.annotation.Resource;
import java.util.List;
@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDao employeeDao;


    public boolean login(String username, String password) {

        return employeeDao.verifyPwd(username, password) == 1;
    }


    public List<EmployeeModel> findUserByCondition(EmployeeParam employeeParam) {
        List<EmployeeModel> list = employeeDao.findUserByCondition(employeeParam);
        return list;
    }


    public Integer createUser(EmployeeModel employeeBO) {
        employeeDao.createUser(employeeBO);

        return employeeBO.getEmpId();
    }


    public Integer updateUser(EmployeeModel employeeBO) {
        Integer a = employeeDao.updateUser(employeeBO);
        return a;

    }


    public Integer deleteUser(Integer empId) {
        Integer a = employeeDao.deleteUser(empId);
        return a;
    }

}
