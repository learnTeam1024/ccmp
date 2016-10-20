package com.pro.bs.service;

import com.pro.bs.dao.DepartmentDao;
import com.pro.bs.model.DepartmentModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/12.
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;
    @Override
    public List<DepartmentModel> findAll() {
       List<DepartmentModel> list=departmentDao.findAll();
        return list;
    }

    @Override
    public DepartmentModel findByDptnum(Integer dptNum) {
       DepartmentModel departmentModel= departmentDao.findByDptnum(dptNum);
        return departmentModel;
    }

    @Override
    public Integer createDpt(int dtpNum,String dptName,int supDptnum) {
        DepartmentModel departmentModel=new DepartmentModel();
        departmentModel.setDptNum(dtpNum);
        departmentModel.setDptName(dptName);
        departmentModel.setSupDptnum(supDptnum);
        Integer a=departmentDao.cteateDpt(departmentModel);
        return a;

    }

    @Override
    public Integer updateDpt(DepartmentModel depatmentModel) {
        departmentDao.updateDpt(depatmentModel);
        return depatmentModel.getId();


    }

    @Override
    public Integer deleteDpt(Integer dptNum) {
        Integer a=departmentDao.deleteDpt(dptNum);
        return  a;

    }
}
