package com.walker.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walker.bean.Simple;
import com.walker.service.SimpleService;

@Component
public class SimpleServiceImpl implements SimpleService {

	@Reference(version = "1.0.0")
	SimpleService simpleService;

	public List<Simple> getSimple() {
		return simpleService.getSimple();
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public int insertSimple(Simple simple) {
		int num = simpleService.insertSimple(simple);
		throw new RuntimeException();
	}

}
