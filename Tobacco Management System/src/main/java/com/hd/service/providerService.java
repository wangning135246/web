package com.hd.service;

import com.hd.entity.Bo.ProviderBo;
import com.hd.entity.response.ProviderResponse;

public interface providerService {

    /**
     * 查询供应商
     * @param proCode
     * @param proName
     * @return
     */
    public ProviderResponse selectProviderList(String proCode,String proName);

    /**
     * 添加供应商的方法
     * @param bo
     * @return
     */
    public int insertProvider(ProviderBo bo);

    /**
     * 删除供应商的方法
     * @param id
     * @return
     */
    public Integer deleteProvider(Integer id);

    /**
     * 修改供应商的方法
     * @param bo
     * @return
     */
    public Integer modifyProvider(ProviderBo bo);
}
