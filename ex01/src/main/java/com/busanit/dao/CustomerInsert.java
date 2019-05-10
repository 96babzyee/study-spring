package com.busanit.dao;

import java.util.Scanner;

import com.busanit.model.Customer;

public class CustomerInsert {
	public Customer insert(Scanner sc) {
		System.out.println("\n<고객 정보 입력 > ");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별(F/M) : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("출생년도 : ");
		int birthYear = sc.nextInt();
		System.out.println("== 고객 정보 입력 완료 ==\n");

		// 고객 객체 생성하여 데이터 받기
		Customer cust = new Customer(name, gender, email, birthYear);
		return cust;
	}
}
