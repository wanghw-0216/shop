package com.zt.shop.entity.dto;

/**
 * @ClassName QueryDTO
 * @Description TODO
 * @Date 2021/5/13 17:35
 * @Version 1.0
 **/
public class QueryDTO {
    private int pageNum = 1;
    private int pageSize = 10;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
