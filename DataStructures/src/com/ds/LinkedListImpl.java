package com.ds;

public class LinkedListImpl {
	private Node head;
	private Node tail;
	
	
	 
	 
	 
	 public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	//Add string to end of the linked list
	public void add(String s) {
		 if(null==head) {
			 this.head = new Node(null,null,s);
		 }
		 else if (!this.head.hasNext()){
			 Node newNode = new Node(this.head,null,s);
			 this.head.setNext(newNode);
			 this.tail=newNode;
		 }
		 else {
			 Node newNode = new Node(this.tail,null,s);
			 this.tail.setNext(newNode);
			 this.tail = newNode;
		 }
		
	 }
	 
	//search method for the linked list
	 public boolean search(String search) {
		Node searchedNode = traverseSearch(this.head, search);
		if(null!=searchedNode) {
			return true;
		}
		else 
			return false;
			
		 
				 
	 }
	 
	 //helper method to be used in traversing the list
	 public Node traverseSearch(Node root,String value) {
			System.out.println(root.getValue());
			if(value.equals(root.getValue())) {
				return root;
			}
			else {
				if(root.hasNext()) {
				  return traverseSearch(root.getNext(), value);
				}
				
			}
			return null;
			
		}
		 
	 //Method to print out linked list;
		 public void traverse(Node a) {
			 System.out.println(a.getValue());
			 if(a.hasNext()) {
				 traverse(a.getNext());
			 }
		 }
		 
		 //Remove string in the linked list
		 public void remove(String s) {
			 if(s.equals(this.head.getValue())) {
				 this.head = this.head.getNext();
				 this.head.setPrevious(null);
				 
			 }
			 else if (s.equals(this.tail.getValue())){
				 this.tail.getPrevious().setNext(null);
				 this.tail=this.tail.getPrevious();
				 
			 }
			 else {
				 Node replacer = traverseSearch(this.head, s);
				 if(null!=replacer) {
				 replacer.getPrevious().setNext(replacer.getNext());
				 replacer.getNext().setPrevious(replacer.getPrevious());
				 }
			 }
		 }
		 
		 //Update a value in the linked list 
		 public void update(String previous, String newString) {
			 Node replacer = traverseSearch(this.head, previous);
			 if(null!=replacer) {
				 replacer.setValue(newString);
			 }
			 
		 }
		 
	 
}
