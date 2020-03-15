package com.czbank.inner;


import com.czbank.entry.UserAddress;

import java.util.List;

/**
 * 订单服务
 */
public interface OrderService {
	
	/**
	 * @param userId
	 * 初始化订单
	 */
	List<UserAddress> initOrder(String userId);

}
