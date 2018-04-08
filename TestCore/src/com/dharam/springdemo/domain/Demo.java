package com.dharam.springdemo.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee)applicationContext.getBean("employee");
		System.out.println(emp);
		System.out.println(emp.getAddressList());
		System.out.println(emp.getAddressMap());
		System.out.println(emp.getAddressProp());
		System.out.println(emp.getAddressSet());
		applicationContext.registerShutdownHook();
	}
	
}
