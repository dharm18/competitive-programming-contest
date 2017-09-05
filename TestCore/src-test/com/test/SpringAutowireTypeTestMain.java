package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.Employee;

public class SpringAutowireTypeTestMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println(employee);
	}

}
