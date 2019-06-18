package com.ds;

public class LinkedListRunner {

	public static void main(String[] args) {

		//linked list implementation using node class
		
		//create head node 
		//using strings
	/*	LinkedListImpl<String> linkedList = new LinkedListImpl<>();
		linkedList.add("head");
		linkedList.add("shoulders");
		linkedList.add("knees");
		linkedList.add("toes");
		
		linkedList.traverse(linkedList.getHead());
		System.out.println( linkedList.search("shoulders1"));
		
		linkedList.remove("knees");
		
		System.out.println("\n\n Removed: \n");
		linkedList.traverse(linkedList.getHead());
		
		linkedList.update("shoulders", "Eyes and Ears");
		System.out.println("\n\n Updated: \n");
		linkedList.traverse(linkedList.getHead());*/
		
		LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
		
		Integer a1 = new Integer(7);
		
		linkedList.add(10);
		linkedList.add(5);
		linkedList.add(a1);
		linkedList.add(22);
		linkedList.add(45);
		
		//testing concurrency
		 Thread t1 = new Thread(()-> {
			
			synchronized (linkedList) {
			System.out.println("hi from" + Thread.currentThread().getName());
			
			linkedList.add(100);linkedList.remove(22); linkedList.remove(45); linkedList.add(45);
			linkedList.traverse(linkedList.getHead());
			} 
		},"ThreadA" );
		
		
		
		Thread t2 = new Thread(()-> {
			
			synchronized (linkedList) {
			System.out.println("hi from" + Thread.currentThread().getName());
			
			linkedList.add(1200);linkedList.remove(7); linkedList.remove(45);linkedList.add(45);linkedList.traverse(linkedList.getHead()); 
			}
			} ,
				"ThreadB");
		
		
		
		t1.start();
		t2.start();
		
		/*
		 //using integer
		  System.out.println("\n\nTest");
		linkedList.traverse(linkedList.getHead());*/
		
		/*linkedList.remove(22);
		System.out.println(linkedList.search(5));
		
		
		//linkedList.remove(10);
		
		//linkedList.traverse(linkedList.getHead());
		
		System.out.println("\nafter:");
		linkedList.traverse(linkedList.getHead());*/
		
	}

}

