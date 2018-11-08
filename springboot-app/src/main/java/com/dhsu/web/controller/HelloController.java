package com.dhsu.web.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName： HelloController
 * @Author: dhSu
 * @Description: 实现RESTFUL API
 * @Date:Created in 2018年11月8日
 */
@RestController
public class HelloController {
	
	private final Logger logger= Logger.getLogger(getClass());
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping("/hello")
	public String index() {
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("/hello,host:" + instance.getHost() + ",seriver_id:" + instance.getServiceId());
		return "Hello world!";
	}

}
