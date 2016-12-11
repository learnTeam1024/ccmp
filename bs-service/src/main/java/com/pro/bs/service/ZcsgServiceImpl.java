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
}
