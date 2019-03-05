package com.hd.dao;

import com.hd.entity.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {

    /**
     * 查询供应商的名字
     * @param id
     * @return
     */
    public String selectProName(@Param("id")Integer id);

    /**
     * 查询供应商的ID
     * @param proName
     * @return
     */
    public Integer selectId(@Param("proName")String proName);

    /**
     * 查询供应商表的List
     * @param proCode
     * @param proName
     * @return
     */
    public List<Provider> selectProviderList(@Param("proCode")String proCode, @Param("proName")String proName);

    /**
     * 添加供应商的方法
     * @param proCode
     * @param proName
     * @param proPhone
     * @param proAddress
     * @return
     */
    public int insertProvider(@Param("proCode")String proCode,@Param("proName")String proName,@Param("proPhone")String proPhone,@Param("proAddress")String proAddress);

    /**
     * 删除供应商的方法
     * @param id
     * @return
     */
    public Integer deleteProvider(@Param("id")Integer id);

    /**
     * 修改供应商的方法
     * @param proCode
     * @param proName
     * @param proPhone
     * @param proAddress
     * @return
     */
    public Integer modifyProvider(@Param("proCode")String proCode,@Param("proName")String proName,@Param("proPhone")String proPhone,
                                  @Param("proAddress")String proAddress,@Param("id")Integer id);

}
