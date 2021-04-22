package com.example.demo.order.service.impl;

import com.example.demo.inventory.service.InventoryService;
import com.example.demo.order.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Descriiption
 * @Author bo
 * @Date 2021/4/21 下午6:31
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @DubboReference(version = "1.0.0")
    private InventoryService inventoryService;
    @Override
    public Object create(String name) {
        System.out.println("创建订单： " + name);
        inventoryService.reduce(name);
        return name;
    }
}
