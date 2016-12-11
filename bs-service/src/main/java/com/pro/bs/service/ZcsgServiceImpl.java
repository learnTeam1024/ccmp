package com.pro.bs.service;

import com.pro.bs.dao.ZcsgDao;
import com.pro.bs.model.ZcsgModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016-12-09.
 */
@Service("zcsgSevice")
public class ZcsgServiceImpl implements ZcsgService {
    @Resource private ZcsgDao zcsgDao;
    public List<ZcsgModel> finds() {
        List<ZcsgModel>list= zcsgDao.findAll();
        return list;
    }

    @Override
    public Integer addOne(ZcsgModel zcsgModel) {
        Integer a=zcsgDao.add(zcsgModel);
        return a;
    }

    @Override
    public Integer upOne(ZcsgModel zcsgModel) {
        Integer a=zcsgDao.update(zcsgModel);
        return a;
    }

    @Override
    public ZcsgModel findOnee(Integer id) {
        ZcsgModel zcsgModel=zcsgDao.findOne(id);
        return zcsgModel;
    }

    @Override
    public Integer delete(Integer id) {
        Integer a=zcsgDao.dele(id);
        return a;
    }

    @Override
    public List<ZcsgModel> findByAssetnm(String assetnm) {
        List<ZcsgModel>list=zcsgDao.findByass(assetnm);
        return list;
    }
}
