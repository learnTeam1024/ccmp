package com.pro.bs.dao;

import com.pro.bs.model.EmployeeModel;
import com.pro.bs.model.EmployeeModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户Dao
 * Created by hzq on 2016/10/4.
 */
public interface EmployeeDao {


    Integer verifyPwd(@Param("userName") String userName, @Param("password") String password);

    /**
     * 查询用户信息
     * @return List<EmployeeModel>
     */
    List<EmployeeModel> findUserByCondition(EmployeeModel queryBO);

    /**
     * 创建用户
     * @param employeeModel 用户信息
     */
    void createUser(EmployeeModel employeeModel);

    /**
     * 根据用户ID更改用户信息
     * @param employeeModel 用户信息
     * @return 更改条目数
     */
    Integer updateUser(EmployeeModel employeeModel);


    /**
     * 逻辑删除用户
     * @param empId 用户Id
     * @return 更改条目数
     */
    Integer deleteUser(Integer empId);
}
