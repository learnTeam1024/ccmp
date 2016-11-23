package com.pro.bs.service;

import com.pro.bs.dao.EmpDepDao;
import com.pro.bs.model.EmpDepModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/16.
 */
@Service("empDepService")
public class EmpDepServiceImpl implements EmpDepService {
   @Resource private  EmpDepDao empDepDao;
    @Override
    public List<EmpDepModel> allFind() {
        List<EmpDepModel> list=empDepDao.findAll();
        return list;
    }
    @Override
    public Integer addEmpdep(EmpDepModel empDepModel) {
        Integer a=empDepDao.addEmp(empDepModel);
        return a;
    }

    @Override
    public Integer findNum(Integer id) {
        Integer depNum=empDepDao.findDep(id);
        return depNum;
    }

    @Override
    public Integer upNum(EmpDepModel empDepModel) {
        Integer a=empDepDao.upDep(empDepModel);
        return a;
    }

    @Override
    public Integer deleteEmp(Integer id) {
        Integer a=empDepDao.delete(id);
        return a;
    }
}
