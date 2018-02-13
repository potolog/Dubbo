package com.walker.service;

import java.util.List;

import com.walker.bean.Simple;

public interface SimpleService {

	public List<Simple> getSimple();

	int insertSimple(Simple simple);

}
