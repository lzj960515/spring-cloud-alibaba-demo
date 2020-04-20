package com.lzj.spring.cloud.alibaba.consumer.controller;

import com.lzj.spring.cloud.alibaba.consumer.service.ConsumerService;
import com.lzj.spring.cloud.alibaba.dubbo.provider.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Zijian Liao
 * @date 2020/1/17 17:55
 * @description
 */
@RestController
@RefreshScope
public class ConsumerController {

	@Resource
	private ConsumerService consumerService;

	@GetMapping("/echo/{str}")
	public String echo(@PathVariable String str) {
		return "consumer send with feign and reply is: " + consumerService.echo(str);
	}

	@Value("${user.name}")
	private String username;

	@GetMapping("/user")
	public String user() {
		return username;
	}

	@Reference(version = "1.0.0")
	private HelloService helloService;

	@GetMapping("/hello/{str}")
	public String hello(@PathVariable String str) {
		return "Consumer send with dubbo and reply is:" + helloService.hello(str);
	}

}
