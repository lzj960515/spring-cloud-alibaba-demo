package com.lzj.spring.cloud.alibaba.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zijian Liao
 * @date 2020/1/17 17:41
 * @description
 */
@RestController
public class ProviderController {

	@GetMapping("/echo/{string}")
	public String echo(@PathVariable String string) {
		return "Hello Nacos!";
	}

}
