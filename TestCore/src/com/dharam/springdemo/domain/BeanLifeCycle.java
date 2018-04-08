package com.dharam.springdemo.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee)applicationContext.getBean("employee");
		System.out.println(emp);
		
	}

}
