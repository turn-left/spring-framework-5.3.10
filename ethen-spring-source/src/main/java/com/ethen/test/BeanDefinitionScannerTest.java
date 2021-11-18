package com.ethen.test;

import com.ethen.common.AppUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.util.Map;

public class BeanDefinitionScannerTest {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
//		scanner.addExcludeFilter();
//		scanner.addIncludeFilter();
		scanner.scan("com.ethen");
		final Map<String, AppUser> beansOfType = context.getBeansOfType(AppUser.class);
		System.err.println(beansOfType);
	}
}
