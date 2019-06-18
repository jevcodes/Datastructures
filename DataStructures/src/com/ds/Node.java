package com.ds;

public class Node<E> {
	
	Node<E> previous;
	Node<E> next;
	E value;
	public Node(Node<E> previousNode, Node<E> nextNode, E valueNode) {
		
		this.previous = previousNode;
		this.next = nextNode;
		this.value = valueNode;
	}
	
	public Node() {
		
	}

	public Node<E> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	
	public boolean hasNext() {
		Node<E> temp = this.next;
		if(null!=temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean hasPrevious() {
		Node<E> temp = this.previous;
		if(null!=temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
