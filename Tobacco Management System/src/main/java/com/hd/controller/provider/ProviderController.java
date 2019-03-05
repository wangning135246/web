package com.hd.controller.provider;

import com.hd.entity.response.ProviderResponse;
import com.hd.service.impl.providerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/providerList")
public class ProviderController {

    @Resource
    providerServiceImpl providerService;


    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("provider/providerlist");
        return view;
    }

    /**
     * 查询供应商的方法
     * @param proCode
     * @param proName
     * @return
     */
    @RequestMapping("selectProvider")
    @ResponseBody
    public ProviderResponse selectProvider(String proCode,String proName){
        return providerService.selectProviderList(proCode,proName);
    }

    /**
     * 删除供应商的方法
     * @param id
     * @return
     */
    @RequestMapping("deleteProvider")
    @ResponseBody
    public int deleteProvider(Integer id){
        return providerService.deleteProvider(id);
    }


}
