package com.hd.entity.response;

import com.hd.entity.po.BillListPo;

import java.util.List;

public class BillListResponse {

    List<BillListPo> data ;

    public List<BillListPo> getData() {
        return data;
    }

    public void setData(List<BillListPo> data) {
        this.data = data;
    }
}
