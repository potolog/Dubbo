package com.walker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.walker.bean.Simple;
import com.walker.dao.SimpleDao;
import com.walker.service.SimpleService;

@Service(version = "1.0.0")
public class SimpleServiceImpl implements SimpleService {

	@Autowired
	private SimpleDao simpleDao;

	@Override
	public List<Simple> getSimple() {
		return simpleDao.getSimple();
	}

	@Override
	public int insertSimple(Simple simple) {
		return simpleDao.insertSimple(simple);
	}

}
