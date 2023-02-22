package com.liming.gmail.service.impl;

import com.liming.gmall.bean.UserAddress;
import com.liming.gmall.service.OrderService;
import com.liming.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ltf
 * @date 2021-08-23 22:21
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }

    public List<UserAddress> initOrder1(String passwd) {
        List<UserAddress> userAddressList = userService.getUserAddressList(passwd);
        userAddressList.forEach(System.out::println);
        if(userService.ValidToken(passwd)){
            System.out.println("111");
        }
        return userAddressList;
    }
    public List<UserAddress> initOrder3(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }
    public List<UserAddress> initOrder4(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }
    public List<UserAddress> initOrder5(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }
    public List<UserAddress> initOrder6(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }

    public List<UserAddress> initOrder7(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        userAddressList.forEach(System.out::println);
        return userAddressList;
    }
}
