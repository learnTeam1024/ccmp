package com.pro.bs.service;

import com.alibaba.fastjson.JSON;
import com.pro.bs.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import com.pro.bs.model.EmployeeModel;
import com.pro.bs.model.EmployeeParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Resource
    private EmployeeDao employeeDao;


    public boolean login(String username, String password) {

        return employeeDao.verifyPwd(username, password) == 1;
    }


    public List<EmployeeModel> findUserByCondition(EmployeeParam employeeParam) {

        List<EmployeeModel> userList;
        try {
            userList = employeeDao.findUserByCondition(employeeParam);
        } catch (Exception e) {
            userList = new ArrayList<>();
            LOGGER.error("查询用户记录异常。 param={}", JSON.toJSON(employeeParam),e);
        }
        return userList;
    }

    @Override
    public Integer countUserByCondition(EmployeeParam employeeParam){
        Integer totalSize = null;
        try {
            totalSize = employeeDao.countUserByCondition(employeeParam);
        } catch (Exception e) {
            LOGGER.error("查询用户总数异常。 param={}", JSON.toJSON(employeeParam),e);
        }
        return totalSize == null ? 0 : totalSize;
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
