package com.hd.controller.user;

import com.hd.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("pwdModify")
public class pwdModifyController {

    @Resource
    UserServiceImpl userService;

    @RequestMapping("/index")
    public ModelAndView getindex(String userName) {
        ModelAndView view = new ModelAndView("/user/pwdmodify");
        view.addObject("userName",userName);
        return view;
    }

    /**
     * 这个是修改密码的方法
     * @param userName
     * @param oldpassword
     * @param newpassword
     * @return
     */
    @RequestMapping("pwdModifyUser")
    @ResponseBody
    public int pwdModifyUser(String userName,String oldpassword,String newpassword){
        return userService.pwdmodifyUser(userName,oldpassword,newpassword);
    }

}
