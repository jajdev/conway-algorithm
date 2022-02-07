package com.jennings.ds;

public class SLL_Impl {
	MyNode head;
	int length;

	public SLL_Impl() {
		head = null;
	}

	public SLL_Impl(int o) {
		head = new MyNode(o, null);
	}
	
	public void add(int i) {
		MyNode n = new MyNode(i, head);
		head = n;
	}
	
	public int length() {
		return length;
	}
	
	public void print() {
		MyNode pointer = head;
		while(pointer != null) {
			System.out.print(pointer.getData().toString() + ' ');
			pointer = pointer.getNext();
		}
		System.out.println();
	}
}

class MyNode {
	Integer data;
	MyNode next;

	MyNode(Integer o, MyNode n) {
		data = o;
		next = n;
	}
	
	public MyNode getNext() {
		return next;
	}
	
	public Integer getData() {
		return data;
	}
}
