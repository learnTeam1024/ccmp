package com.pro.bs.service;

import com.pro.bs.dao.EmployeeDao;
import com.pro.bs.vo.EmployeeVO;
import com.pro.bs.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService  {
 @Resource
 private EmployeeDao employeeDao;


    public boolean login(String username, String password) {
        return false;
    }

    public List findAll() {
        List<EmployeeVO>list=employeeDao.findAll();
        return list;
    }
}
