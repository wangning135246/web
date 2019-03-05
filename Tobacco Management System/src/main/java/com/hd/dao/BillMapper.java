package com.hd.dao;

import com.hd.entity.Bill;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface BillMapper {


    /**
     * 查询订单的list
     * @param productName
     * @param isPayment
     * @return
     */
    public List<Bill> selectBill(@Param("productName")String productName,
                                 @Param("isPayment")Integer isPayment);

    /**
     * @param billCode
     * @param productName
     * @param productCount
     * @param totalPrice
     * @param isPayment
     * @param providerId
     */
    public int insertBill(@Param("billCode")String billCode, @Param("productName")String productName,
                           @Param("productCount")Integer productCount, @Param("totalPrice")Integer totalPrice,
                           @Param("isPayment")Integer isPayment, @Param("providerId")Integer providerId);

    /**
     * 删除订单的方法
     * @param id
     * @return
     */
    public Integer deleteBill(@Param("id")Integer id);

    /**
     * 修改订单的方法
     * @param billCode
     * @param productName
     * @param productCount
     * @param totalPrice
     * @param isPayment
     * @param providerId
     * @param id
     * @return
     */
    public Integer modifyBill(@Param("billCode")String billCode, @Param("productName")String productName,
                              @Param("productCount")Integer productCount, @Param("totalPrice")Integer totalPrice,
                              @Param("isPayment")Integer isPayment, @Param("providerId")Integer providerId,@Param("id")Integer id);
}
