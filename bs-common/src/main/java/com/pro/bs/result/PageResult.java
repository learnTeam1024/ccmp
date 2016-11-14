package com.pro.bs.result;

import java.util.List;

/**
 * 分页返回值
 * Created by 青芒 on 16/10/5.
 */
public class PageResult<T> extends BaseResult {

    private static final long serialVersionUID = -2034503757537215973L;
    private int               totalItem;                               // 总记录数
    private int               pageSize;                                // 每页大小
    private int               currentPage       = 1;                   // 当前页
    private int             totalPage;                               // 总页数
    private List<T>           data;                              // 结果集

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public double getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
//    public void setTotalPage(double totalPage) {
//        this.totalPage = totalPage;
//    }
//
//    public int getTotalItem() {
//        return totalItem;
//    }
//
//    public void setTotalItem(int totalItem) {
//        this.totalItem = totalItem;
//    }
//
//    public int getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public int getCurrentPage() {
//        return currentPage;
//    }
//
//    public void setCurrentPage(int currentPage) {
//        this.currentPage = currentPage;
//    }
//
//    public int getTotalPage() {
//        int pageSize = this.getPageSize();
//
//        if(pageSize == 0){
//            return 0;
//        }
//
//        return (int)Math.ceil(this.getTotalItem()/ (double) pageSize);
//    }
//
//    public List<T> getData() {
//        return data;
//    }
//
//    public void setData(List<T> data) {
//        this.data = data;
//    }
}
