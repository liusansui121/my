package com.item.pojo;

import java.io.Serializable;

public class Stock implements Serializable {
    private Long skuId;

    private Integer seckillStock;

    private Integer stock;

    private static final long serialVersionUID = 1L;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getSeckillStock() {
        return seckillStock;
    }

    public void setSeckillStock(Integer seckillStock) {
        this.seckillStock = seckillStock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}