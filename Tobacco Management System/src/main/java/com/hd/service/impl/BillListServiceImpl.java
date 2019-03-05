package com.hd.service.impl;

import com.hd.dao.BillMapper;
import com.hd.dao.ProviderMapper;
import com.hd.entity.Bill;
import com.hd.entity.po.BillAddPo;
import com.hd.entity.po.BillListPo;
import com.hd.entity.response.BillListResponse;
import com.hd.service.BillListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillListServiceImpl implements BillListService {


    @Resource
    private BillMapper billMapper;

    @Resource
    private ProviderMapper providerMapper;

    /**
     * 查询供应商的名字
     * @param id
     * @return
     */
    @Override
    public String selectProName(Integer id) {
        return providerMapper.selectProName(id);
    }

    /**
     * 查询供应商的ID
     * @param proName
     * @return
     */
    @Override
    public Integer selectProId(String proName) {
        Integer proId = providerMapper.selectId(proName);
        return proId;
    }

    /**
     * 添加订单的方法
     * @param billAddPo
     * @return
     */
    @Override
    public int insertBill(BillAddPo billAddPo) {
        Integer proId = this.selectProId(billAddPo.getProviderName());
        Integer id = billMapper.insertBill(billAddPo.getBillCode(),billAddPo.getProductName(),billAddPo.getProductCount(),billAddPo.getTotalPrice(),billAddPo.getIsPayment(),proId);
        return id;
    }

    /**
     * 删除订单的方法
     * @param id
     * @return
     */
    @Override
    public Integer deleteBill(Integer id) {
        return billMapper.deleteBill(id);
    }


    /**
     * 修改订单的方法
     * @param billAddPo
     * @return
     */
    @Override
    public Integer modifyBill(BillAddPo billAddPo) {
        Integer proId = this.selectProId(billAddPo.getProviderName());
        Integer number = this.billMapper.modifyBill(billAddPo.getBillCode(),billAddPo.getProductName(),billAddPo.getProductCount(),billAddPo.getTotalPrice(),billAddPo.getIsPayment(),proId,billAddPo.getId());
        return number;
    }

    /**
     * 查询订单的方法
     * @param productName
     * @param isPayment
     * @return
     */
    @Override
    public BillListResponse selectBillList(String productName, Integer isPayment) {
        BillListResponse response = new BillListResponse();
        List<Bill> list = billMapper.selectBill(productName,isPayment);
        List<BillListPo> listPos = new ArrayList<>();
        String newPayment = null;
        for (Bill bill: list) {
            BillListPo billListPo = new BillListPo();
            billListPo.setId(bill.getId());
            billListPo.setBillCode(bill.getBillCode());
            billListPo.setProName(this.selectProName(bill.getProviderId()));
            billListPo.setProductName(bill.getProductName());
            billListPo.setTotalPrice(bill.getTotalPrice());
            billListPo.setProductCount(bill.getProductCount());
            if(bill.getIsPayment() == 1){
                newPayment = "已支付";
            }else{
                newPayment = "未支付";
            }
            billListPo.setIsPayment(newPayment);
            billListPo.setCreateTime(bill.getcreateDate());
            listPos.add(billListPo);
        }
        response.setData(listPos);
        return response;
    }

}
