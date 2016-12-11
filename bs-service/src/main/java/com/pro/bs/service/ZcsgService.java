package com.pro.bs.service;

import com.pro.bs.model.ZcsgModel;

import java.util.List;

/**
 * Created by Administrator on 2016-12-09.
 */
public interface ZcsgService {
    List<ZcsgModel> finds();
    Integer addOne(ZcsgModel zcsgModel);
    Integer upOne(ZcsgModel zcsgModel);
    ZcsgModel findOnee(Integer id);
    Integer delete(Integer id);
    List<ZcsgModel>findByAssetnm(String assetnm);
}
