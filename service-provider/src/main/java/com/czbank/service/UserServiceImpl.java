package com.czbank.service;
import com.alibaba.dubbo.config.annotation.Service;
import com.czbank.entry.UserAddress;
import com.czbank.inner.UserService;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author
 */
@org.springframework.stereotype.Service(value = "UserService")
@Service(interfaceClass = UserService.class,version = "1.0.0",interfaceName = "UserService")
public class UserServiceImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		String finalUserId = "1";
		List<UserAddress> list = new CopyOnWriteArrayList<>();
		if (finalUserId.equals(userId)){
			UserAddress address = new UserAddress();
			address.setUserId(String.valueOf(1));
			address.setPhoneNum("杭州市");
			list.add(address);
		}else {
			UserAddress address = new UserAddress();
			address.setUserId(String.valueOf(2));
			address.setPhoneNum("郑州市");
			list.add(address);
		}
		return list;
	}
}
