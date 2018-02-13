package com.walker.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walker.bean.Simple;
import com.walker.bean.Walker;
import com.walker.service.DubboService;
import com.walker.service.SimpleService;

@RestController
@RequestMapping("/dubbo")
public class Controller {

	@Autowired
	private DubboService dubboService;

	@Autowired
	private SimpleService simpleService;

	@RequestMapping(value = "/getWalker", method = RequestMethod.GET)
	public Walker getwalker() {
		return dubboService.sayHello("1");
	}

	@RequestMapping(value = "/getSimple", method = RequestMethod.GET)
	public List<Simple> getSimple() {
		return simpleService.getSimple();
	}

	@RequestMapping(value = "/getSession")
	public String getSession(HttpSession httpSession, String key) {
		String value = (String) httpSession.getAttribute(key);
		if (value == null) {
			return "Fail,Can't find this key";
		}
		return value;
	}

	@RequestMapping(value = "/setSession")
	public String setSession(HttpSession httpSession, String key, String value) {
		httpSession.setAttribute(key, value);
		return "succ";
	}

	@RequestMapping(value = "/tryTranscation")
	public Integer tryTranscation() {
		Simple simple = new Simple();
		simple.setAge(18);
		simple.setName("1996846");
		return simpleService.insertSimple(simple);
	}

}
