package com.pro.bs.service;

import com.pro.bs.dao.EmployeeDao;
import com.pro.bs.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService  {
 @Resource
 private EmployeeDao employeeDao;
    public ResultVO findAll() {
        return null;
    }
}
