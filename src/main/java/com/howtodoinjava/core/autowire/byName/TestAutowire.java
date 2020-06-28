package com.howtodoinjava.core.autowire.byName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		Triangle triangle = (Triangle) context.getBean("triangle");
		System.out.println(triangle);
	}
}
