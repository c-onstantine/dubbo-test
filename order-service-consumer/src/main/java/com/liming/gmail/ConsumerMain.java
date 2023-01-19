package com.liming.gmail;

import com.liming.gmail.service.impl.OrderServiceImpl;
import com.liming.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author ltf
 * @date 2021-08-24 10:00
 */
public class ConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = context.getBean(OrderService.class);
        bean.initOrder("1");
        OrderService o1 = new OrderServiceImpl();
        o1.initOrder("2");
        System.out.println("调用完成");
        System.in.read();
    }
}
