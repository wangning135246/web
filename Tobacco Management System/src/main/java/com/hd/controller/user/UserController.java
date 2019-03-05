package com.hd.controller.user;

import com.hd.entity.response.UserResponse;
import com.hd.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("userList")
public class UserController {

    @Resource
    UserServiceImpl userService;

    @RequestMapping("/index")
    public ModelAndView getindex() {
        ModelAndView view = new ModelAndView("/user/userlist");
        return view;
    }

    /**
     * 这个是查询用户List的方法
     * @param userName
     * @return
     */
    @RequestMapping("/selectUser")
    @ResponseBody
    public UserResponse selectUser(String userName){
        return userService.selectUserList(userName);
    }

    /**
     * 这个是删除用户的方法
     * @param id
     * @return
     */
    @RequestMapping("/deleteUser")
    @ResponseBody
    public Integer deleteUser(Integer id){
        return userService.deleteUser(id);
    }
}
