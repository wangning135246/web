package com.hd.service;

import com.hd.entity.po.BillAddPo;
import com.hd.entity.response.BillListResponse;

public interface BillListService {

    /**
     * 查询订单的表
     * @param productName
     * @param isPayment
     * @return
     */
    public BillListResponse selectBillList(String productName, Integer isPayment);

    /**
     * 查询供应商的名字
     * @param id
     * @return
     */
    public String selectProName(Integer id);

    /**
     * 查询供应商的ID
     * @param proName
     * @return
     */
    public Integer selectProId(String proName);

    /**
     * 添加订单
     * @param bill
     */
    public int insertBill(BillAddPo bill);

    /**
     * 删除订单的方法
     * @param id
     * @return
     */
    public Integer deleteBill(Integer id);

    /**
     *修改订单的方法
     * @param billAddPo
     * @return
     */
    public Integer modifyBill(BillAddPo billAddPo );
}
