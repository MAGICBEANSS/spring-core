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

		A a1 = (A) context.getBean("a");
		A a2 = (A) context.getBean("a");

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println("comparing a->b hashcode ");

		System.out.println(a1.getB().hashCode());
		System.out.println(a2.getB().hashCode());

		System.out.println("comparing a->b->c hashcode ");

		System.out.println(a1.getB().getC().hashCode());
		System.out.println(a2.getB().getC().hashCode());

		System.out.println("comparing a->b->c->varC value ");

		System.out.println(a1.getB().getC().getVarc().hashCode());
		System.out.println(a2.getB().getC().getVarc().hashCode());

		System.out.println("comparing objects ");


		if(a1.equals(a2)) {
			System.out.println("a1 equals a2");
		}
		else {
			System.out.println("a1 not equals a2");

		}
		if(a1.getB().equals(a2.getB())) {
			System.out.println("a1.b equals a2.b");
		}
		else {
			System.out.println("a1.b not equals a2.b");
		}

		if(a1.getVarA().equals(a2.getVarA())){
			System.out.println("a1.varA equals a2.varA");
		}
		else {
			System.out.println("a1.varA not equals a2.varA");

		}

	}
}
