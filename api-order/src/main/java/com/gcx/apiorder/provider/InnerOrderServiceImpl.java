package com.gcx.apiorder.provider;


import com.gcx.apicommon.entity.Order;
import com.gcx.apicommon.service.InnerOrderService;
import com.gcx.apiorder.service.TOrderService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;


@DubboService
public class InnerOrderServiceImpl implements InnerOrderService {
    @Resource
    TOrderService orderService;
    @Override
    public List<Order> listTopBuyInterfaceInfo(int limit) {
        return orderService.listTopBuyInterfaceInfo(limit);
    }
}
