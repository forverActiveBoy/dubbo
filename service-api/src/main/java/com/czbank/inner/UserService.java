package com.czbank.inner;


import com.czbank.entry.UserAddress;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {
	
	/**
	 * 查询用户收获地址集合
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddressList(String userId);

}
