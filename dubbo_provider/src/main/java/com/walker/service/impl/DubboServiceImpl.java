package com.walker.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walker.bean.Walker;
import com.walker.service.DubboService;

@Service(version="1.0.0")
public class DubboServiceImpl implements DubboService {

	@Override
	public Walker sayHello(String name) {
		Walker walker = new Walker();
		walker.setId(1);
		walker.setName("简单");
		return walker;
	}

}
