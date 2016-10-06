package com.pro.bs.query;

/**
 * 分页查询
 */
public class PageQueryModel {

    /**
     * 当前页码
     */
    private int pageNo;

    /**
     * 起始记录
     */
    private int startRow;

    /**
     * 每页大小
     */
    private int pageSize = 5;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getPageSize() {
        return pageSize;
    }

}
