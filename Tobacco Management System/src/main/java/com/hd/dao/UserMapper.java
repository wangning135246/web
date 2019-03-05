package com.hd.dao;

import com.hd.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

    /**
     * 登录的方法
     * @param email
     * @param password
     * @return
     */
    User login(@Param("email") String email,@Param("password") String password);

    /**
     * 这个是查询UserList
     * @param userName
     * @return
     */
    List<User> selectUserList(@Param("userName")String userName);

    /**
     * 这个是添加user的方法
     * @param email
     * @param password
     * @param userName
     * @param userAddress
     * @param userPhone
     * @param sex
     * @return
     */
    int insertUser(@Param("email")String email,@Param("password")String password,@Param("userName")String userName,@Param("userAddress")String userAddress,
                   @Param("userPhone")String userPhone,@Param("sex")Integer sex);

    /**
     * 这个是删除User的方法
     * @param id
     * @return
     */
    Integer deleteUser(@Param("id")Integer id);

    /**
     * 这个是修改user的方法
     * @param id
     * @param username
     * @param sex
     * @param userAddress
     * @param userPhone
     * @return
     */
    Integer modifyUser(@Param("id")Integer id,@Param("username")String username,
                       @Param("sex")Integer sex,@Param("userAddress")String userAddress,@Param("userPhone")String userPhone);

    /**
     * 这个是修改密码的方法
     * @param id
     * @param password
     * @return
     */
    Integer pwdModifyUser(@Param("id")Integer id,@Param("password") String password);

    /**
     * 查询user的ID
     * @param userName
     * @return
     */
    Integer selectUserName(@Param("userName")String userName);

    /**
     * 查询密码的方法
     * @param id
     * @return
     */
    String selectPassword(@Param("id")Integer id);
}
