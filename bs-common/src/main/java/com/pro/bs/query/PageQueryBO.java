package com.pro.bs.query;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询BO
 */
public class PageQueryBO<T> implements Serializable {

    private static final long serialVersionUID  = 8761383695528059074L;

    /**
     * 默认页大小
     */
    public static final int   DEFAULT_PAGE_SIZE = 10;

    private int               totalItem;                               // 总记录数
    private int               pageSize;                                // 每页大小
    private int               currentPage       = 1;                   // 当前页
    private int               totalPage;                               // 总页数
    private List<T>           resultList;                              // 结果集

    /**
     * @return List<T> 结果集
     */
    public List<T> getResultList() {
        return resultList;
    }

    /**
     * @param resultList 结果集
     */
    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    /**
     * 获取总记录数
     * 
     * @return int 总记录数
     */
    public int getTotalItem() {
        return totalItem;
    }

    /**
     * 设置总记录数
     * 
     * @param totalItem 总记录数
     */
    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
        // 自动设置总页数
        if (pageSize <= 0) {
            totalPage = 1;
        } else {
            totalPage = (totalItem + pageSize - 1) / pageSize;
        }
    }

    /**
     * 获取总页数
     * 
     * @return int 总页数
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * 获取每页查询的记录数
     * 
     * @return int 每页查询记录数
     */
    public int getPageSize() {
        if (pageSize == 0){
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    /**
     * 获取当前页
     * 
     * @return int 当前页
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @param currentPage the currentPage to set
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * @param totalPage the totalPage to set
     */
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

}
