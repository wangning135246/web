package com.hd.service.impl;


import com.hd.dao.ProviderMapper;
import com.hd.entity.Bo.ProviderBo;
import com.hd.entity.Provider;
import com.hd.entity.response.ProviderResponse;
import com.hd.service.providerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class providerServiceImpl implements providerService {


    @Resource
    ProviderMapper providerMapper;

    /**
     * 查询供应商的List
     * @param proCode
     * @param proName
     * @return
     */
    @Override
    public ProviderResponse selectProviderList(String proCode, String proName) {
        ProviderResponse response = new ProviderResponse();
        List<Provider> list =  providerMapper.selectProviderList(proCode,proName);
        response.setData(list);
        return response;
    }

    /**
     * 添加供应商的方法
     * @param bo
     * @return
     */
    @Override
    public int insertProvider(ProviderBo bo) {
        return providerMapper.insertProvider(bo.getProCode(),bo.getProName(),bo.getProPhone(),bo.getProAddress());
    }

    /**
     * 删除供应商的方法
     * @param id
     * @return
     */
    @Override
    public Integer deleteProvider(Integer id) {
        return providerMapper.deleteProvider(id);
    }

    /**
     * 修改供应商的方法
     * @param bo
     * @return
     */
    @Override
    public Integer modifyProvider(ProviderBo bo) {
       Integer integer =  providerMapper.modifyProvider(bo.getProCode(),bo.getProName(),bo.getProPhone(),bo.getProAddress(),bo.getId());
        return integer;
    }

}
