package com.pro.bs.service;

import com.pro.bs.bo.EmployeeBO;
import com.pro.bs.dao.EmployeeDao;
<<<<<<< HEAD

import com.pro.bs.vo.EmployeeVO;
import com.pro.bs.vo.ResultVO;

import org.springframework.stereotype.Service;
=======
>>>>>>> 709765a7f2e12b37450364db71624af2d262e3c1

import javax.annotation.Resource;
import java.util.List;

<<<<<<< HEAD
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService  {
 @Resource
 private EmployeeDao employeeDao;
=======
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeDao employeeDao;
>>>>>>> 709765a7f2e12b37450364db71624af2d262e3c1


    public boolean login(String username, String password) {
        employeeDao.verifyPwd(username, password);
        return false;
    }


    public List findAll() {
        List<EmployeeVO> list = employeeDao.findAll();
        return list;
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
