package com.ethen.test;

import com.ethen.bean.UserController;
import com.ethen.config.AppConfig;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionReaderTest {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		final AnnotatedBeanDefinitionReader beanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
//		beanDefinitionReader.registerBean(UserController.class);
//		final Object userController = context.getBean("userController");
//		System.err.println(userController);
//		System.err.println(context.getBeanDefinition("userController"));


		final XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
		final int i = xmlBeanDefinitionReader.loadBeanDefinitions("spring.xml");
		System.err.println(i);
		System.err.println(context.getBean("user2"));

	}
}
