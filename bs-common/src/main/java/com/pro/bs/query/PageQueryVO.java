package com.pro.bs.query;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询BO
 */
public class PageQueryVO implements Serializable {


    private static final long serialVersionUID = 4276974548249742584L;

    /**
     * 查询起始行数
     */
    private int startRow;
    /**
     * 查询每页多少行
     */
    private int rowCount;

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
}
