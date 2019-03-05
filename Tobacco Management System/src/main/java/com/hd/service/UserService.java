package com.hd.service;


import com.hd.entity.Bo.UserInsertBo;
import com.hd.entity.Bo.UserModifyBo;
import com.hd.entity.User;
import com.hd.entity.response.UserResponse;

import java.util.List;

public interface UserService {


    /**
     * 这个是登录的方法
     * @param email
     * @param password
     * @return
     */
    User login(String email, String password);

    /**
     * 这个是查询UserList
     * @param userName
     * @return
     */
    UserResponse selectUserList(String userName);


    int insertUser(UserInsertBo bo);


    Integer deleteUser(Integer id);


    Integer updateUser(UserModifyBo bo);


    Integer pwdmodifyUser(String userName,String oldPassword,String newPassword);

    Integer selectUserID(String userName);

    String selectPassword(String userName);
}
