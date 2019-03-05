package com.hd.controller.bill;


import com.hd.entity.po.BillAddPo;
import com.hd.service.impl.BillListServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("modifyBill")
public class ModifyBillController {

    @Resource
    BillListServiceImpl billListService;

    @RequestMapping("/index")
    public ModelAndView successIndex(String id,String billCode,String productName,String productCount,String proName,String totalPrice,String isPayment){
        ModelAndView modelAndView = new ModelAndView("bill/billmodify");
        modelAndView.addObject("id",id);
        modelAndView.addObject("billCode",billCode);
        modelAndView.addObject("productName",productName);
        modelAndView.addObject("productCount",productCount);
        modelAndView.addObject("totalPrice",totalPrice);
        modelAndView.addObject("proName",proName);
        modelAndView.addObject("isPayment",isPayment);
        return modelAndView;
    }

    /**
     * 修改订单的方法
     * @param billAddPo
     * @return
     */
    @RequestMapping("/updateBill")
    @ResponseBody
    public int updateBill(BillAddPo billAddPo){
        return billListService.modifyBill(billAddPo);
    }

}
