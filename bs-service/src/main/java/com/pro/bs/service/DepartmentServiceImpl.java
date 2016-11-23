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
    public Integer createDpt(int dptNum,String dptName,int supDptnum) {
        DepartmentModel departmentModel=new DepartmentModel();
        departmentModel.setDptNum(dptNum);
        departmentModel.setDptName(dptName);
        departmentModel.setSupDptnum(supDptnum);
        Integer a=departmentDao.cteateDpt(departmentModel);
        return a;

    }

    @Override
    public void updateDpt(Integer id,int dptNum,String dptName,int supDptnum) {
        DepartmentModel departmentModel=new DepartmentModel();
        departmentModel.setDptNum(dptNum);
        departmentModel.setDptName(dptName);
        departmentModel.setSupDptnum(supDptnum);
        departmentModel.setId(id);
        departmentDao.updateDpt(departmentModel);



    }

    @Override
    public Integer deleteDpt(Integer dptNum) {
        Integer a=departmentDao.deleteDpt(dptNum);
        return  a;

    }

    public Integer findCounts() {
        Integer depCount=departmentDao.findCount();
        return depCount;
    }

    public List<DepartmentModel> depPage(DepartmentModel departmentModel) {
        List<DepartmentModel> list=departmentDao.findDep(departmentModel);
        return list;
    }

    @Override
    public Integer findId(Integer dptNum) {
        Integer id=departmentDao.findOne(dptNum);
        return id;
    }

    @Override
    public Integer findUp(Integer dptNum) {
        Integer supNum=departmentDao.findSup(dptNum);
        return supNum;
    }
}
