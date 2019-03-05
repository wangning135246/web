package com.hd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/successLogin")
public class HeadController {

    @RequestMapping("/getIndex")
    public ModelAndView successIndex(String userName){
        ModelAndView view = new ModelAndView("head");
        view.addObject("userName",userName);
        return view;
    }

}
