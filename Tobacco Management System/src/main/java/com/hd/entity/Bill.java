package com.hd.entity;

import java.io.Serializable;

/**
 * 这个类是订单的实例化
 */
public class Bill implements Serializable {
    /**
     * 创建序列化的实例
     */
    public static final long serialVersionUID = 1L;

    /**
     * 订单的ID
     */
    private Integer id;
    /**
     * 订单的编码
     */
    private String billCode;
    /**
     * 产品的名字
     */
    private String productName;
    /**
     * 产品的数量
     */
    private int productCount;
    /**
     * 总价
     */
    private Integer totalPrice;
    /**
     * 创建的时间
     */
    private String createDate;
    /**
     * 是否支付
     */
    private int isPayment;
    /**
     * 供应商的ID
     */
    private int providerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getcreateDate() {
        return createDate;
    }

    public void setcreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(int isPayment) {
        this.isPayment = isPayment;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }
}
