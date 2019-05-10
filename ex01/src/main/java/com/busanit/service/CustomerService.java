package com.busanit.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.busanit.dao.CustomerDelete;
import com.busanit.dao.CustomerInsert;
import com.busanit.dao.CustomerUpdate;
import com.busanit.dao.CustomerViewData;
import com.busanit.model.Customer;

public class CustomerService implements ICustomerService {
	public String run(String name) {
		// 고객정보를 저장할 자료구조 선언
		ArrayList<Customer> custList = new ArrayList<>();
		
		int cnt = 0; // custList.size()
		int index = -1; // 배열인덱스의 시작은 0부터 시작하므로 최초 인덱스는 -1
		
		Scanner sc = new Scanner(System.in);
		
		CustomerInsert custInsert = new CustomerInsert();
		CustomerViewData custView = new CustomerViewData();
		CustomerUpdate custUpdate = new CustomerUpdate();
		CustomerDelete custDelete = new CustomerDelete();
		
		while (true) {
			cnt = custList.size();
			System.out.println("고객 정보 관리 프로그램");
			System.out.printf("[INFO] 고객 수 : %d, 인덱스 : %d\n", cnt, index);
			System.out.println("(I)nsert, (P)revious, (C)current, (N)ext, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴를 선택하세요 : ");
			String str = sc.next();
			str = str.toLowerCase(); // 입력한 문자열을 모두소문자로 변환
			switch (str.charAt(0)) {
			case 'i': // 고객 정보 입력
				custList.add(custInsert.insert(sc));
				index++;
				break;
			case 'p':// 이전 고객 정보
				System.out.println("\n< 이전 고객 정보를 출력 >");
				if (index <= 0) {
					System.out.println("이전 고객 정보가 존재하지 않음\n");
				} else {
					index--;
					custView.viewData(custList.get(index));
				}
				break;
			case 'c':// 현재 고객 정보
				System.out.println("\n< 현재 고객 정보를 출력 >");
				if (index >= 0 && index < cnt) {
					custView.viewData(custList.get(index));
				} else {
					System.out.println("현재 고객 정보가 존재하지 않음\n");
				}
				break;
			case 'n': // 다음 고객 정보
				System.out.println("\n< 다음 고객 정보를 출력 >");
				if (index >= cnt - 1) {
					System.out.println("다음 고객 정보가 존재하지 않음\n");
				} else {
					index++;
					custView.viewData(custList.get(index));
				}
				break;
			case 'u':// 고객 정보 수정
				System.out.println("\n< 고객 정보 수정 >");
				if (index >= 0 && index < cnt) {
					System.out.println(index + "번째 데이터를 수정");
					custList.add(custUpdate.update(custList.get(index),sc));
					System.out.println("고객 정보  수정 완료!\n");
				} else {
					System.out.println("수정할 데이터가 존재하지 않음\n");
				}
				break;
			case 'd': // 고객 정보 삭제
				System.out.println("\n< 고객 정보 삭제 >");
				if (index >= 0 && index < cnt) {
					System.out.println(index + "번째 데이터를 삭제");
					custList = custDelete.delete(custList,index);
					System.out.println("고객 정보 삭제 완료!\n");
				} else {
					System.out.println("삭제할 데이터가 존재하지 않음\n");
				}
				break;
			case 'q':// 프로그램 종료
				System.out.println("< 프로그램 종료 >");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("== 메뉴 잘못 입력 ==\n");
			} // end switch
		} // end while
	} // end run
} // end CustomerService
