package com.gcx.apiorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcx.apicommon.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.gcx.apiorder.model.entity.Order
 */
@Mapper
public interface TOrderMapper extends BaseMapper<Order> {

    /**
     * 获取前 limit 购买数量的接口
     * @param limit
     * @return
     */
    List<Order> listTopBuyInterfaceInfo(int limit);
}




