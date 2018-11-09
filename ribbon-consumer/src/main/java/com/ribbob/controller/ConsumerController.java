package com.ribbob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName： ConsumerController
 * @Author: dhSu
 * @Description: 实现/ribbon-consumer接口来调用HELLO-SERVICE服务
 * @Date:Created in 2018年11月9日
 */
@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/ribbon-consumer",method=RequestMethod.GET)
	public String helloConsumer() {
		return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
	}
	
	@RequestMapping(value="/ribbon-consumer1",method=RequestMethod.GET)
	public String helloConsumer1() {
		return "consumer";
	}

}
