package com.busanit.dao;

import java.util.Scanner;

import com.busanit.model.Customer;

public class CustomerUpdate {
	public Customer update(Customer cust, Scanner sc) {
		System.out.print("변경할 이름 : ");
		cust.setName(sc.next());
		
		System.out.print("변경할 성별 : ");
		cust.setGender(sc.next().charAt(0));
		
		System.out.print("변경할 이메일 : ");
		cust.setEmail(sc.next());
		
		System.out.print("변경할 출생년도 : ");
		cust.setBirthYear(sc.nextInt());
		
		return cust;
	}
}
