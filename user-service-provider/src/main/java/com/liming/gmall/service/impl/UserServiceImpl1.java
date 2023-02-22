package com.liming.gmall.service.impl;


import com.liming.gmall.bean.UserAddress;
import com.liming.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class UserServiceImpl1 implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		// TODO Auto-generated method stub
		UserAddress address1 = new UserAddress(1, "北京邮电大学", "1", "ltf", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "燕山大学", "1", "ltf_old", "010-56253825", "N");
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return Arrays.asList(address1,address2);
	}

	@Override
	public boolean ValidToken(String token) {
		if (token.equals("1")) {
			return true;
		}
		return false;
	}
}
