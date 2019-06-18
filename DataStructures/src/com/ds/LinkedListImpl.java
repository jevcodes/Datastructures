package com.ds;

public class LinkedListImpl<E> {
	private Node<E> head;
	private Node<E> tail;
	
	
	 
	 
	 
	 public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	public Node<E> getTail() {
		return tail;
	}

	public void setTail(Node<E> tail) {
		this.tail = tail;
	}

	//Add string to end of the linked list
	public void add(E s) {
		 if(null==head) {
			 this.head = new Node<E>(null,null,s);
		 }
		 else if (!this.head.hasNext()){
			 Node<E> newNode = new Node<E>(this.head,null,s);
			 this.head.setNext(newNode);
			 this.tail=newNode;
		 }
		 else {
			 Node<E> newNode = new Node<E>(this.tail,null,s);
			 this.tail.setNext(newNode);
			 this.tail = newNode;
		 }
		
	 }
	 
	//search method for the linked list
	 public boolean search(E search) {
		Node<E> searchedNode = traverseSearch(this.head, search);
		if(null!=searchedNode) {
			return true;
		}
		else 
			return false;
			
		 
				 
	 }
	 
	 //helper method to be used in traversing the list
	 public Node<E> traverseSearch(Node<E> root,E value) {
			//System.out.println(root.getValue());
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
		 public void traverse(Node<E> a) {
			 System.out.println(a.getValue());
			 if(a.hasNext()) {
				 traverse(a.getNext());
			 }
		 }
		 
		 //Remove string in the linked list
		 public void remove(E s) {
			 if(s.equals(this.head.getValue())) {
				 this.head = this.head.getNext();
				 this.head.setPrevious(null);
				 
			 }
			 else if (s.equals(this.tail.getValue())){
				 this.tail.getPrevious().setNext(null);
				 this.tail=this.tail.getPrevious();
				 
			 }
			 else {
				 Node<E> replacer = traverseSearch(this.head, s);
				 if(null!=replacer) {
				 replacer.getPrevious().setNext(replacer.getNext());
				 replacer.getNext().setPrevious(replacer.getPrevious());
				 }
				 else {
					 throw new RuntimeException("Item does not exist " + s);
				 }
				 
				 
			 }
		 }
		 
		 //Update a value in the linked list 
		 public void update(E previous, E newString) {
			 Node<E> replacer = traverseSearch(this.head, previous);
			 if(null!=replacer) {
				 replacer.setValue(newString);
			 }
			 
		 }
		 
	 
}
