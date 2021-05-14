package com.zt.shop.entity.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName GoodsInfoDTO
 * @Description TODO
 * @Date 2021/5/13 16:43
 * @Version 1.0
 **/
public class GoodsInfoDTO {
    private Integer id;

    private String goodsNum;

    private String goodsName;

    private List<String> goodsImg;

    private BigDecimal price;

    private String goodsDes;


    public String getGoodsDes() {
        return goodsDes;
    }

    public void setGoodsDes(String goodsDes) {
        this.goodsDes = goodsDes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public List<String> getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(List<String> goodsImg) {
        this.goodsImg = goodsImg;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
