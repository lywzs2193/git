package org.dubbo.provider.impl;

import java.util.ArrayList;
import java.util.List;

import org.dubbo.model.User;
import org.dubbo.provider.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "hello " + name;
	}

	public List getUsers() {
		List userList = new ArrayList();
		
		User one = new User();
		one.setAge(30);
		one.setName("lyw");
		one.setSex("男");
		
		User two = new User();
		two.setAge(28);
		two.setName("zs");
		two.setSex("女");
		
		userList.add(one);
		userList.add(two);
		
		return userList;
	}

}
