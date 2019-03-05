package com.hd.controller.provider;

import com.hd.entity.Bo.ProviderBo;
import com.hd.service.impl.providerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("addProvider")
public class AddProviderController {

    @Resource
    providerServiceImpl providerService;

    @RequestMapping("/index")
    public ModelAndView getindex() {
        ModelAndView view = new ModelAndView("/provider/provideradd");
        return view;
    }

    /**
     * 添加供应商的方法
     * @param bo
     * @return
     */
    @RequestMapping("insertProvider")
    @ResponseBody
    public int insertProvider(ProviderBo bo){
        return providerService.insertProvider(bo);
    }

}
