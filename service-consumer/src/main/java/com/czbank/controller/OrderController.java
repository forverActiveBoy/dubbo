package com.czbank.controller;
import com.czbank.entry.UserAddress;
import com.czbank.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 */
@RestController
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@RequestMapping(value = "/init")
	public List<UserAddress> initOrder(String userId){
		return orderServiceImpl.initOrder(userId);
	}
}
