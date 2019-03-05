package com.hd.entity;


import java.io.Serializable;

/**
 * 这个类是对供应商的实例化
 */
public class Provider implements Serializable {
    /**
     * 创建序列化的实例
     */
    public static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    private Integer id;
    /**
     * 供应商编码
     */
    private String proCode;
    /**
     * 供应商的名字
     */
    private String proName;
    /**
     * 供应商电话
     */
    private String proPhone;

    /**
     * 供应商地址
     */
    private String proAddress;

    /**
     * 创建时间
     */
    private String createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPhone() {
        return proPhone;
    }

    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    public String getProAddress() {
        return proAddress;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
