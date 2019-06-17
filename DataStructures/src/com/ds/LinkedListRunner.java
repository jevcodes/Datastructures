package com.ds;

public class LinkedListRunner {

	public static void main(String[] args) {

		//linked list implementation using node class
		
		//create head node 
		LinkedListImpl linkedList = new LinkedListImpl();
		linkedList.add("head");
		linkedList.add("shoulders");
		linkedList.add("knees");
		linkedList.add("toes");
		
		linkedList.traverse(linkedList.getHead());
		System.out.println( linkedList.search("shoulders1"));
		
		linkedList.remove("knees");
		
		System.out.println("\n\n Removed: \n");
		linkedList.traverse(linkedList.getHead());
		
	}

}

