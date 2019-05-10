package com.coderby.myapp.hello;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.coderby.myapp.hello.controller.HelloController;
import com.coderby.myapp.member.Customer;
import com.coderby.myapp.member.Person;

public class HelloMain {
	public static void main(String[] args) {
//		IHelloService helloService = new HelloService();
//		HelloController controller = new HelloController(helloService);

//		HelloController controller = new HelloController();
//		controller.setHelloService(helloService);
//		controller.hello("홍길동");

		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		HelloController controller = context.getBean("helloController", HelloController.class);
		Customer customer = context.getBean("customer", Customer.class);

		List<Object> personList = customer.getLists();
		Person person = (Person) personList.get(2);
		System.out.println("Person getName() : " + person.getName());
		System.out.println("Person getAge() : " + person.getAge());
		System.out.println("Person toString() : " + person.toString());
		controller.hello("JinKyoung");
		context.close();
	}
}