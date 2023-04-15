package com.springcore.lifestyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String []agrs) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifestyle/config.xml");
		Employee e1= (Employee) context.getBean("emp1");
		System.out.println(e1);
	}
}
