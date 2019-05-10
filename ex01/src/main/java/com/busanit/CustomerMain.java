package com.busanit;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.busanit.controller.CustomerController;

public class CustomerMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		CustomerController custController = (CustomerController) context.getBean("custController");
		
		custController.run("busanit");
		context.close();
	}
}
