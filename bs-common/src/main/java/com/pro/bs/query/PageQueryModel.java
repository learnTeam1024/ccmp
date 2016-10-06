package com.pro.bs.query;

import com.pro.bs.constans.GlobalConstant;

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
    private int pageSize;

    public int getPageNo() {
        if (pageNo < 1){
            pageNo = 1;
        }
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getStartRow() {
        return this.getPageSize() * this.getPageNo();
    }

    public int getPageSize() {
        if (pageSize == 0) {
            this.pageSize = GlobalConstant.NORAML_PAGE_SIZE;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
