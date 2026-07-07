package com.Day5.collection;

import java.util.*;

public class QueueDemo {
	public static void main(String []args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("Apple");
		q.offer("IBM");
		q.offer("Oracle");
		
		System.out.println(q.peek()); // Fetch Value and do not remove it
		
		while(!q.isEmpty())
			System.out.println(q.poll()); // Fetch value and remove it from the queue
		
		// Code for Dequeue 
		
		Deque<String> dq = new  LinkedList<String>();
		dq.offer("Apple");
		dq.offer("IBM");
		dq.offer("Oracle");
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		
		while(!dq.isEmpty()) {
			System.out.println(dq.pollLast());
		}
		
	}
}
