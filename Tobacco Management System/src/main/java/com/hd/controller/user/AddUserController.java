package com.hd.controller.user;

import com.hd.entity.Bo.UserInsertBo;
import com.hd.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
@RequestMapping("addUser")
public class AddUserController {

    @Resource
    UserServiceImpl userService;

    @RequestMapping("/index")
    public ModelAndView getindex() {
        ModelAndView view = new ModelAndView("/user/useradd");
        return view;
    }

    /**
     * 添加用户的方法
     * @param bo
     * @return
     */
    @RequestMapping("insertUser")
    @ResponseBody
    public int insertUser(UserInsertBo bo){
        return userService.insertUser(bo);
    }

}
