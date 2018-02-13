package com.walker.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walker.bean.Walker;
import com.walker.service.DubboService;

@Component
public class DubboConsumerService implements DubboService {

	@Reference(version = "1.0.0")
	DubboService dubboService;

	@Override
	public Walker sayHello(String name) {
		Walker walker = dubboService.sayHello("1");
		return walker;
	}

}
