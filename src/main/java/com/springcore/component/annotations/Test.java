package com.springcore.component.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/component/annotations/config.xml");
		Student s1= (Student)context.getBean("student");
		System.out.println(s1);
		
	}

}
