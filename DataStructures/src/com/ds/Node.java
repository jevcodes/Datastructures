package com.ds;

public class Node {
	
	Node previous;
	Node next;
	String value;
	public Node(Node previous, Node next, String value) {
		super();
		this.previous = previous;
		this.next = next;
		this.value = value;
	}
	
	public Node() {
		
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean hasNext() {
		Node temp = this.next;
		if(null!=temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean hasPrevious() {
		Node temp = this.previous;
		if(null!=temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
