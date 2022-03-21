package com.jennings.test;

import com.jennings.ds.SLL_Impl;

public class SLL_Test {
	public static void main(String[] args) {
		testSimpleList();
	}
	
	public static void testSimpleList() {
		SLL_Impl list1 = new SLL_Impl();
		
		//Create SLL with 5 elements
		for(int i = 1; i <= 5; i++) {
			list1.add(i);
		}
		list1.print();
		
		list1 = new SLL_Impl();
		//Create SLL with 5 elements, printing each element after adding it
		for(int i = 100; i <= 500; i += 100) {
			list1.add(i);
			list1.print();
		}
	}
	
	public static void testAddFunctions() {
		SLL_Impl list1 = new SLL_Impl();
		
		//Create SLL with 5 elements
		for(int i = 1; i <= 5; i++) {
			list1.add(i);
		}
	}
	
	public static void startTimer() {
		
	}
	
	public static void stopTimer() {
		
	}
	
	public static void printTimer() {
		
	}
}
