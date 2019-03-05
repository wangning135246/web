package com.hd.entity;

import java.io.Serializable;

/**
 * 这个类是一个user用户的实例化
 */
public class User implements Serializable{
    /**
     * 创建序列化的实例
     */
    public static final long serialVersionUID = 1L;
    /**
     * 创建用户的ID
     */
    private Integer id;
    /**
     *用户的邮箱，也是登录时候的账号
     */
    private String email;
    /**
     * 登录时候的密码
     */
    private String password;
    /**
     * 登录的名字
     */
    private String username;
    /**
     * 性别
     */
    private Integer sex;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 登录的时间
     */
    private String regTime;

    /**
     * 用户地址
     */
    private String userAddress;


    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }


    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

}
