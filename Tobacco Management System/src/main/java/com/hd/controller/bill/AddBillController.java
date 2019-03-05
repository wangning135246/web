package com.hd.controller.bill;


import com.hd.entity.po.BillAddPo;
import com.hd.service.impl.BillListServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("addBill")
public class AddBillController {

    @Resource
    BillListServiceImpl billListService;

    @RequestMapping("/index")
    public ModelAndView successIndex(){
        ModelAndView modelAndView = new ModelAndView("bill/billadd");
        return modelAndView;
    }

    /**
     * 添加订单的方法
     * @param billAddPo
     * @return
     */
    @RequestMapping("/insertBill")
    @ResponseBody
    public int addBill(BillAddPo billAddPo){
        return billListService.insertBill(billAddPo);
    }

}
