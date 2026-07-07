package com.Day5.collection;

import java.util.*;
public class CollectionDemo {
	public static void main(String []args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Apple");
		lst.add("Microsoft");
		lst.addFirst("Google");
		lst.addLast("JPMC");
		lst.add(2,"Oracle");
		
		System.out.println("Traversing by using index");
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("Iterating using Iterator");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Using For-Each");
		for(String e: lst)
			System.out.println(e);
		
		System.out.println("Using For-Each Method");
		lst.forEach(System.out::println);
		
		
		
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("IBM");
		arl.add("Walmart");
		arl.add("Jane Street");
		
		arl.addAll(lst);
		
		System.out.println("Traversing through All the Array List");
		for(String e: arl)
			System.out.println(e);
		
		
		HashSet<String> hst = new HashSet<String>(arl);
		System.out.println("Converting the Array list into Hashset");
		for(String e: hst)
			System.out.println(e);
		
		TreeSet<String> trs = new TreeSet<String>(hst);
		System.out.println("Traversing through Sorted Set");
		for(String e: trs)
			System.out.println(e);
	}
}
