package com.hd.controller.provider;

import com.hd.entity.Bo.ProviderBo;
import com.hd.service.impl.providerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@Controller
@RequestMapping("modifyprovider")
public class ModifyProviderController {

    @Resource
    providerServiceImpl providerService;

    @RequestMapping("/index")
    public ModelAndView getindex(String id,String proCode,String proName,String proPhone,String proAddress) {
        ModelAndView view = new ModelAndView("/provider/providermodify");
        view.addObject("id",id);
        view.addObject("proCode",proCode);
        view.addObject("proName",proName);
        view.addObject("proPhone",proPhone);
        view.addObject("proAddress",proAddress);
        return view;
    }

    /**
     * 修改供应商的方法
     * @param bo
     * @return
     */
    @RequestMapping("providerModify")
    @ResponseBody
    public int providerModify(ProviderBo bo){
        return providerService.modifyProvider(bo);
    }

}
