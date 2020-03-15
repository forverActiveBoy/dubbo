package com.czbank.service;

import com.czbank.entry.UserAddress;
import com.czbank.inner.OrderService;
import com.czbank.inner.UserService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

import java.util.List;

/**
 * @author
 */
@Service
public class OrderServiceImpl implements OrderService {
	/**
	 * 阿里系调用服务注解
	 */
	@Reference(application = "service-provider",interfaceClass = UserService.class,version = "1.0.0",interfaceName = "UserService")
	private UserService userService;

	@Override
	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}
	
	

}
