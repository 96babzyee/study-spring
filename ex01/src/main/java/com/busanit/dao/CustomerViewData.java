package com.busanit.dao;

import com.busanit.model.Customer;

public class CustomerViewData {
	public void viewData(Customer cust) {
	
	System.out.println("== 고객 정보 ==");
	System.out.println("이름: " + cust.getName());
	System.out.println("성별 : " + cust.getGender());
	System.out.println("이메일 : " + cust.getEmail());
	System.out.println("출생년도 : " + cust.getBirthYear());
	System.out.println("=======================\n");
	}
}
