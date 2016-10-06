package com.pro.bs.service;


import com.pro.bs.model.EmployeeModel;
import com.pro.bs.model.EmployeeModel;
import com.pro.bs.model.EmployeeParam;


import java.util.List;

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
    /**
     * 根据条件查找用户
     * @return List<EmployeeModel>用户信息
     */
    List<EmployeeModel> findUserByCondition(EmployeeParam employeeParam);

    /**
     * 根据条件查找用户数量
     * @return 用户数量
     */
    Integer countUserByCondition(EmployeeParam employeeParam);

    /**
     * 创建用户
     * @param employeeModel
     * @return
     */
    Integer createUser(EmployeeModel employeeModel);

    /**
     * 更新用户
     * @param employeeModel
     * @return
     */
    Integer updateUser(EmployeeModel employeeModel);

    /**
     * 逻辑删除用户
     * @param empId
     * @return
     */
    Integer deleteUser(Integer empId);
}
