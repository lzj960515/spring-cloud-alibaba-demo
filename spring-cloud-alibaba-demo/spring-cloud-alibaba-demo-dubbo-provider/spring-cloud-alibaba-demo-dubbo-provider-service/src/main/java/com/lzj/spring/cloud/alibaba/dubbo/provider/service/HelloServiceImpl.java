package com.lzj.spring.cloud.alibaba.dubbo.provider.service;

import com.lzj.spring.cloud.alibaba.dubbo.provider.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Zijian Liao
 * @date 2020/1/17 18:48
 * @description
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String string) {
		return "Hello dubbo!";
	}

}
