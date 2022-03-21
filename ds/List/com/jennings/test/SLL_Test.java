package com.jennings.test;

import com.jennings.ds.SLL_Impl;

public class SLL_Test {
	private static long stopwatch;
	private static long timer;

	public static void main(String[] args) {
		//testSimpleList();
		testRemoveDuplicates();
		testAddFunctions();
	}
	
	public static void testSimpleList() {
		SLL_Impl list1 = new SLL_Impl();
		SLL_Impl list2 = new SLL_Impl();
		
		//Create SLL with 5 elements
//		for(int i = 1; i <= 5; i++) {
//			list1.add(i);
//		}
//		list1.print();
		
		list1 = new SLL_Impl();
		//Create SLL with 5 elements, printing each element after adding it
		for(int i = 100; i <= 500; i += 100) {
			list1.add(i);
			list2.addToTail(i);			
		}
		list1.print();
		list2.print();
	}

	public static void testRemoveDuplicates() {
		SLL_Impl list1 = new SLL_Impl();
		String tester = "JAVA COFFEE CODING POWER";
		for(int i = 0; i <= tester.length() - 1; i ++) {
			list1.addToTail(tester.charAt(i));
		}
		list1.print();
		list1.removeDuplicates();
		list1.print();
	}	
	
	public static void testAddFunctions() {
		SLL_Impl list1 = new SLL_Impl();
		int max = 20000;
			
		//Add 5 elements to front of the list 
		startTimer();
		for(int i = 1; i <= max; i++) {
			list1.addToHead(i);
		}
		stopTimer();
		
		System.out.print("Test1: Add to Head of List - ");
		printTimer();
		
		//Add 5 elements to back of the list 
		startTimer();
		for(int i = 1; i <= max; i++) {
			list1.addToTail(i);
		}
		stopTimer();
		
		System.out.print("Test2: Add to Tail of List (Optimized) - ");
		printTimer();
		
		//Add 5 elements to back of the list 
		startTimer();
		for(int i = 1; i <= max; i++) {
			list1.addToTail_Slow(i);
		}
		stopTimer();		
		System.out.print("Test3: Add to Tail of List - ");
		printTimer();
	}
	
	public static void startTimer() {
		timer = 0;
		stopwatch = System.currentTimeMillis();
	}
	
	public static void stopTimer() {
		timer = System.currentTimeMillis() - stopwatch;
		stopwatch = 0;
	}
	
	public static void printTimer() {
		System.out.println("Elasped Time in milliseconds: " + timer);
	}
}
