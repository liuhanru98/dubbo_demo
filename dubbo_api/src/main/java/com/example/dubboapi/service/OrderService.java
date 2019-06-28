package com.example.dubboapi.service;

import java.util.List;

import com.example.dubboapi.model.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
