package com.pro.bs.service;

import com.pro.bs.dao.TuserDao;
import com.pro.bs.model.TuserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016-12-18.
 */
@Service("tuserSevice")
public class TuserServiceImpl implements   TuserService {
    @Resource private TuserDao tuserDao;
    public List<TuserModel> finds() {
        List<TuserModel>list=tuserDao.finds();
        return list;
    }

    @Override
    public Integer adds(TuserModel tuserModel) {
        Integer a=tuserDao.add(tuserModel);
        return a;
    }

    @Override
    public TuserModel find(Integer id) {
        TuserModel tuserModel=tuserDao.find(id);
        return tuserModel;
    }

    @Override
    public Integer update(TuserModel tuserModel) {
        Integer a=tuserDao.update(tuserModel);
        return a;
    }

    @Override
    public Integer delete(Integer id) {
        Integer a=tuserDao.delete(id);
        return a;
    }

    @Override
    public List<TuserModel> findz(String staffId) {
        List<TuserModel>list=tuserDao.findc(staffId);
        return list;
    }
}
