package com.pro.bs.service;

import com.pro.bs.dao.ApproveDao;
import com.pro.bs.model.ApproveModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016-11-26.
 */
@Service("approveService")
public class ApproveServiceImpl implements  ApproveService {
    @Resource private ApproveDao approveDao;
    @Override
    public Integer addApp(ApproveModel approveModel) {
        Integer a=approveDao.save(approveModel);
        return a;
    }

    @Override
    public List<ApproveModel> findAll(String peopleName) {
        List<ApproveModel>list=approveDao.refer(peopleName);
        return list;
    }

    @Override
    public List<ApproveModel> findOne(String peopleName) {
        List<ApproveModel>list=approveDao.findDep(peopleName);
        return list;
    }

    @Override
    public Integer agr(Integer id) {
        Integer a=approveDao.agree(id);
        return a;
    }

    @Override
    public Integer refu(Integer id) {
        Integer a=approveDao.refuse(id);
        return a;
    }

    @Override
    public Integer agreeSec(Integer id) {
        Integer a=approveDao.agreeSecond(id);
        return a;
    }

    @Override
    public Integer refuseSec(Integer id) {
        Integer a=approveDao.refuseSecond(id);
        return a;
    }

    @Override
    public Integer agreeThr(Integer id) {
        Integer a=approveDao.agreeThree(id);
        return a;
    }

    @Override
    public Integer refuseThr(Integer id) {
        Integer a=approveDao.refuseThree(id);
        return a;
    }

    @Override
    public List<ApproveModel> findDu(Integer supDptnum) {
        List<ApproveModel>list=approveDao.finds(supDptnum);
        return list;
    }

    @Override
    public List<ApproveModel> findSeco() {
        List<ApproveModel>list=approveDao.findSec();
        return list;
    }

    @Override
    public List<ApproveModel> findThr() {
        List<ApproveModel> list=approveDao.findThree();
        return list;
    }
}
