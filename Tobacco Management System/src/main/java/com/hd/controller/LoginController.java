package com.hd.controller;

import com.hd.entity.User;
import com.hd.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
@RequestMapping("userLogin")
public class LoginController {

    @Resource
    private UserService userService;

    /**
     * 这个是用户登录的方法
     * @param userEmail
     * @param userPassword
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public User login(String userEmail, String userPassword){
        return  userService.login(userEmail,userPassword);
    }

    @RequestMapping("/index")
    public ModelAndView getindex() {
        ModelAndView view = new ModelAndView("login");
        return view;
    }

}
