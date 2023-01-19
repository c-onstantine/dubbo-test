package com.liming.bootconsumer.controller;

import com.liming.gmall.bean.UserAddress;
import com.liming.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ltf
 * @date 2021-08-24 12:04
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/initorder")
    public List<UserAddress> initOrder(@RequestParam("uid") String uid){
        return orderService.initOrder(uid);
    }
}
