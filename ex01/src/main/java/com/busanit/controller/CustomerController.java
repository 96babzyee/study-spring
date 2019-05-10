package com.busanit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.busanit.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	ICustomerService custService;

	public void setCustomerService(ICustomerService custService) {
		this.custService = custService;
	}

	public void run(String name) {
		System.out.println("HelloController : " + custService.run(name));
	}
}
