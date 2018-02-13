package com.walker.bean;

import java.io.Serializable;

public class Walker implements Serializable {

	private static final long serialVersionUID = -8498578933794332241L;

	private String name;

	private Integer Id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
}
