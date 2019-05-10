package com.busanit.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.busanit.model.Customer;

public class CustomerDelete {
	public ArrayList<Customer> delete(ArrayList<Customer> custList, int index) {
		custList.remove(index);
		return custList;
	}
}
