package com.example.demo.order.controller;

import com.example.demo.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descriiption
 * @Author bo
 * @Date 2021/4/21 下午6:30
 **/
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("create")
    public Object create(String name) {
        return orderService.create(name);
    }
}
