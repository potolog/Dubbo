package com.walker.dao;

import java.util.List;


import com.walker.bean.Simple;

public interface SimpleDao {
	
	public List<Simple> getSimple();
	
	int insertSimple(Simple simple);
	
}
