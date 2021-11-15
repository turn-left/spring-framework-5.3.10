package com.ethen.test;

import com.ethen.common.AppUser;
import com.ethen.config.AppConfig;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

public class BeanDefinitionTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// 编程式注册BeanDefinition
		AbstractBeanDefinition bd = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		bd.setBeanClass(AppUser.class);
		bd.setAbstract(false);
		bd.setScope("singleton");
		bd.setPropertyValues(new MutablePropertyValues(new HashMap<String, String>() {{
			put("userid", "007");
			put("username", "James Bond");
			put("password", "信条");
		}}));
		context.registerBeanDefinition("appUser", bd);

		System.err.println(context.getBean("appUser"));
	}
}
