package com.howtodoinjava.core.autowire.byName;
import com.howtodoinjava.core.autowire.byName.test.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

		A a = (A) context.getBean("a");
		System.out.println(a);
	}
}
