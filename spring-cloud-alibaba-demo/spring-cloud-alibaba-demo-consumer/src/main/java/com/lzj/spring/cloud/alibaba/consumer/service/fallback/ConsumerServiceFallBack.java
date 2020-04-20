package com.lzj.spring.cloud.alibaba.consumer.service.fallback;

import com.lzj.spring.cloud.alibaba.consumer.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @author Zijian Liao
 * @date 2020/1/19 10:29
 * @description
 */
@Component
public class ConsumerServiceFallBack implements ConsumerService {

	@Override
	public String echo(String string) {
		return "network is busy,please try again later!";
	}

}
