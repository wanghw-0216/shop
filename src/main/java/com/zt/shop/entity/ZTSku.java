package com.zt.shop.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "zt_sku")
public class ZTSku implements Serializable {
    @Id
    private Integer id;

    private String skuNum;

    private String skuName;

    private String skuImg;

    private BigDecimal price;

    private String skuDes;



    private static final long serialVersionUID = 1L;

    public String getSkuDes() {
        return skuDes;
    }

    public void setSkuDes(String skuDes) {
        this.skuDes = skuDes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(String skuNum) {
        this.skuNum = skuNum == null ? null : skuNum.trim();
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg == null ? null : skuImg.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}