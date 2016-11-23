package com.pro.bs.service;

import com.pro.bs.model.EmpDepModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
public interface EmpDepService {
    /**
     * 列出所有员工职位信息
     *
     */
    List<EmpDepModel> allFind();
    /**
     * 增加员工职位信息
     */
    Integer addEmpdep(EmpDepModel empDepModel);
    /**
     * 查询对应ID部门编号
     */
    Integer findNum (Integer id);
    /**
     * 升职
     */
    Integer upNum(EmpDepModel empDepModel);
    /**
     * 删除
     */
    Integer deleteEmp(Integer id);

}
