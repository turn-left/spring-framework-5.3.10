package com.ethen.bean;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public void sayHello() {
		System.err.println(UserService.class.getName() + "#sayHello()");
	}
}
