package com.ethen.test;

import com.ethen.bean.UserService;
import com.ethen.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocMainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		final UserService userService = (UserService) context.getBean("userService");
		userService.sayHello();
	}
}
