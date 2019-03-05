package com.hd.service.impl;

import com.hd.dao.UserMapper;
import com.hd.entity.Bo.UserInsertBo;
import com.hd.entity.Bo.UserModifyBo;
import com.hd.entity.User;
import com.hd.entity.response.UserResponse;
import com.hd.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String email,String password) {
        User user = userMapper.login(email,password);
        if(user != null){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public UserResponse selectUserList(String userName) {
        UserResponse response = new UserResponse();
        List<User> list = userMapper.selectUserList(userName);
        response.setData(list);
        return response;
    }

    @Override
    public int insertUser(UserInsertBo bo) {
        return userMapper.insertUser(bo.getEmail(),bo.getPassword(),bo.getUserName(),bo.getUserAddress(),bo.getUserPhone(),bo.getSex());
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public Integer updateUser(UserModifyBo bo) {
            return userMapper.modifyUser(bo.getId(),bo.getUserName(),bo.getSex(),bo.getUserAddress(),bo.getUserPhone());
    }

    /**
     * 根据ID修改密码
     * @param userName
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @Override
    public Integer pwdmodifyUser(String userName,String oldPassword,String newPassword) {
        if(this.selectPassword(userName).equals(oldPassword)){
            return userMapper.pwdModifyUser(this.selectUserID(userName),newPassword);
        }else{
            return 0;
        }
    }

    /**
     * 查询用户ID的方法
     * @param userName
     * @return
     */
    @Override
    public Integer selectUserID(String userName) {
        return userMapper.selectUserName(userName);
    }

    /**
     * 查询用户密码的方法
     * @param userName
     * @return
     */
    @Override
    public String selectPassword(String userName) {
        return userMapper.selectPassword(this.selectUserID(userName));
    }

}
