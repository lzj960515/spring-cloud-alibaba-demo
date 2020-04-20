package com.lzj.spring.cloud.alibaba.consumer.service;

import com.lzj.spring.cloud.alibaba.consumer.service.fallback.ConsumerServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Zijian Liao
 * @date 2020/1/17 17:56
 * @description
 */
@FeignClient(value = "service-provider", fallback = ConsumerServiceFallBack.class)
public interface ConsumerService {

	@GetMapping(value = "/echo/{string}")
	String echo(@PathVariable("string") String string);

}
