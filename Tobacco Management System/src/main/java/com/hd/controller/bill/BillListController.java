package com.hd.controller.bill;


import com.hd.entity.response.BillListResponse;
import com.hd.service.impl.BillListServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("billList")
public class BillListController {

    @Resource
    BillListServiceImpl billListService;

    @RequestMapping("/index")
    public ModelAndView successIndex(){
        ModelAndView modelAndView = new ModelAndView("bill/billList");
        return modelAndView;
    }

    /**
     * 查询订单详情的方法
     * @param productName
     * @param isPayment
     * @return
     */
    @RequestMapping("/selectBillList")
    @ResponseBody
    public BillListResponse selectBillList(String productName, Integer isPayment){
        BillListResponse response = new BillListResponse();
        response = billListService.selectBillList(productName,isPayment);
        return response;
    }

    /**
     * 删除订单的方法
     * @param id
     * @return
     */
    @RequestMapping("/deleteBill")
    @ResponseBody
    public Integer deleteBill(Integer id){
        return billListService.deleteBill(id);
    }

}
