package com.Day4.datastructures;

public class LinkedList<T> {
	
	private class Node{
		private T data;
		public Node next;
		
		public Node(T data) {
			this.data = data;
		}
			
		public T getData() {
			return data;
		}
		
	}
	
	private Node head,last;
	private int size;
	
	public LinkedList() {
		size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void addData(T data) {
					
			Node nn = new Node(data);
			if(head == null) {
				head = nn;
			}
			else {
				last.next = nn;
				size++;
			}
			last = nn;
	}
	
	public void insert(int index,T data) {
		
		if(index > size) {
			throw new IllegalArgumentException("Index Out Of Bounds");
		}
		
		Node nn = new Node(data);
		
		if(index == 0) {
			nn.next = head;
			head = nn;
		}
		else {
			
			Node temp = head;
			int count = 0;
			
			while(count != index - 1) {
				temp = temp.next;
				count++;
			}
			
			nn.next = temp.next;
			temp.next = nn;

		}
		size++;
		
	}
	
	public void remove(int index) {
		if(index > size) {
			throw new IllegalArgumentException("Index out of bounds!");
		}
		
		if(index == 0) {
			head = head.next;
		}
		else {
			Node t = head;
			int count = 0;
			while(count != index-1) {
				t = t.next;
				count++;
			}
			
			t.next = t.next.next;
			if (t.next == null) last = t;
			else last = t.next;
		}
		size--;
	}

	public void print(){
		Node temp = head;
		if(temp == null) {
			throw new NullPointerException("List is empty!");
		}
		else {
			while(temp != null) {
				System.out.println(temp.getData());
				temp = temp.next;
			}
		}
	}

}
