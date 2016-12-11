package com.pro.bs.dao;

import com.pro.bs.model.ZcsgModel;

import java.util.List;

/**
 * Created by Administrator on 2016-12-09.
 */
public interface ZcsgDao {
    List<ZcsgModel> findAll() ;
    Integer add(ZcsgModel zcsgModel);
}
