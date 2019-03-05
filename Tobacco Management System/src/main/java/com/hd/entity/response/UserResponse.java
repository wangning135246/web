package com.hd.entity.response;

import com.hd.entity.User;

import java.util.List;

public class UserResponse {

    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
