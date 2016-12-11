package com.pro.bs.dao;

import com.pro.bs.model.ZcsgModel;

import java.util.List;

/**
 * Created by Administrator on 2016-12-09.
 */
public interface ZcsgDao {
    /**
     * 查找全部申购信息
     */
    List<ZcsgModel> findAll() ;

    /**
     *申请申购
     */
    Integer add(ZcsgModel zcsgModel);

    /**
     *更新申购信息
     */
    Integer update(ZcsgModel zcsgModel);

    /**
     *查找一条申购信息
     */
    ZcsgModel findOne(Integer id);
    /**
     * 删除数据
     */
    Integer dele(Integer id);
    /**
     * 根据资产名称搜索
     */
    List<ZcsgModel>findByass(String assetnm);
}
