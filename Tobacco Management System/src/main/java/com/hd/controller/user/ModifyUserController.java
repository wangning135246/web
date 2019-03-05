package com.hd.controller.user;

import com.hd.entity.Bo.UserModifyBo;
import com.hd.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("modifyUser")
public class ModifyUserController {

    @Resource
    UserServiceImpl userService;

    @RequestMapping("/index")
    public ModelAndView getindex(String id,String userName,String userPhone,String sex,String userAddress) {
        ModelAndView view = new ModelAndView("/user/usermodify");
        view.addObject("id",id);
        view.addObject("userName",userName);
        view.addObject("userPhone",userPhone);
        view.addObject("sex",sex);
        view.addObject("userAddress",userAddress);
        return view;
    }

    /**
     * 这个是修改用户的方法
     * @param bo
     * @return
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    public int updateUser(UserModifyBo bo){

        return userService.updateUser(bo);
    }
}
