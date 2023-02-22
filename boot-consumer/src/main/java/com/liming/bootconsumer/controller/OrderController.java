package com.liming.bootconsumer.controller;

import com.liming.gmall.bean.UserAddress;
import com.liming.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
    public List<UserAddress> initOrder(@RequestParam("uid") String uid) {
        return orderService.initOrder(uid);
    }

    @RequestMapping("/initorder2")
    public List<UserAddress> initOrder2(HttpServletRequest request) {
        String token = request.getParameter("token");
        if (checkAuth(token)) {
            System.out.println("true");
        }
        return orderService.initOrder(token);
    }

    @RequestMapping("/initorder3")
    public void initOrder3(HttpServletRequest request) {
        String passwd = request.getParameter("passwd");
        orderService.initOrder(passwd);
    }


    private boolean checkAuth(String token) {
        return true;
    }

    public void addtest() {
        orderService.initOrder("1");
        System.out.println("qiubabi");
    }
}
