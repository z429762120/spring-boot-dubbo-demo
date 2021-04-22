package com.example.demo.inventory.service.impl;

import com.example.demo.inventory.service.InventoryService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Descriiption
 * @Author bo
 * @Date 2021/4/21 下午6:53
 **/
@DubboService(version = "1.0.0")
public class InventoryServiceImpl implements InventoryService {
    @Override
    public void reduce(String name) {
        System.out.println("扣减库存： " + name);
    }
}
