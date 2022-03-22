package com.jennings.ds;

import java.util.HashSet;

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
		addToHead(i);
	}
	
	public void addToHead(int i) {
		MyNode n = new MyNode(i, head);
		head = n;
		length++;
	}
	
	public void addToTail(int i) {
		MyNode n = new MyNode(i, null);
		if (null == head) {
			head = n;
		} else {
			MyNode current = head;
			while (null != current.getNext()) {
				if(null != current.getNext().getNext()) {
					current = current.getNext().getNext();
				} else {
					current = current.getNext();
				}
			}
							
			current.setNext(n);
		}
		length++;
	}
	
	public void addToTail_Slow(int i) {
		MyNode n = new MyNode(i, null);
		if (null == head) {
			head = n;
		} else {
			MyNode current = head;
			while (null != current.getNext()) {
				current = current.getNext();
			}
			current.setNext(n);
		}
		length++;
	}
	
	public boolean remove(int n) {
		if (null == head) {
			return false;
		}
		MyNode current = head;
		if(current.getData() == n) {
			head = head.getNext();
			return true;
		}
		MyNode next = head.getNext();
		
		while (null != next) {
			if (next.getData() == n) {
				current.setNext(next.getNext());
				return true;
			} else {
				current = next;
				next = next.getNext();
			}
		}
		return false;
	}
	
	public void removeDuplicates() {
		MyNode current = head;
		HashSet<Integer> set = new HashSet<>();
		while (null != current) {
			if (set.contains(current.getData())) {
				remove(current.getData());
			} else {
				set.add(current.getData());
			}
			current = current.getNext();
		}
	}
	
	public void removeDuplicatesWithoutTempBuffer() {
		MyNode current = head;
		while (null != current) {
			MyNode runner = head;
			while (runner != null) {
				if(runner.getData() == current.getData() && runner != current) {
					remove(runner.getData());
				}
			}
		}
	}
	
//	public MyNode findKthToLastElement(int k) {
//		int indexToFind = length() - 1 - k;
//		MyNode current = head;
//
//		while (null != current && indexToFind > 0 ) {
//			current =
//		}
//	}
	
	public int length() {
		return length;
	}
	
	public void print() {
		MyNode pointer = head;
		while (pointer != null) {
			System.out.print(pointer.getData().toString() + ' ');
			pointer = pointer.getNext();
		}
		System.out.println();
	}
}

class MyNode {
	private Integer data;
	private MyNode next;

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
	public void setNext(MyNode n) {
		next = n;
	}
}
