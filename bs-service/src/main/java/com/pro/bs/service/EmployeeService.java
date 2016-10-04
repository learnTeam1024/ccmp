package com.pro.bs.service;

import com.pro.bs.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * 用户service
 * Created by hzq on 2016/10/4.
 */

public interface EmployeeService {

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return true通过 false验证不通过
     */
    boolean login(String username, String password);

public ResultVO findAll();

}
