package com.liming.bootconsumer.controller;

import com.liming.bootconsumer.service.impl.OrderServiceImpl;
import com.liming.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author ltf
 * @date 2023-01-19 17:40
 */
public class AddGitTest {
    public void addTest(String s) {
        OrderServiceImpl orderService = new OrderServiceImpl();
        List<UserAddress> userAddresses = orderService.initOrder1(s);
        System.out.println(userAddresses);
    }
}
