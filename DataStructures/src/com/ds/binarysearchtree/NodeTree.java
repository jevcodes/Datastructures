package com.ds.binarysearchtree;

public class NodeTree<E extends Comparable<E>> {
	
	NodeTree<E> root;
	NodeTree<E> left;
	NodeTree<E> right;
	E value;
	
	public NodeTree() {
		
	}

	public NodeTree(NodeTree<E> root, NodeTree<E> left, NodeTree<E> right, E value) {
		super();
		this.root = root;
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public NodeTree<E> getRoot() {
		return root;
	}

	public void setRoot(NodeTree<E> root) {
		this.root = root;
	}

	public NodeTree<E> getLeft() {
		return left;
	}

	public void setLeft(NodeTree<E> left) {
		this.left = left;
	}

	public NodeTree<E> getRight() {
		return right;
	}

	public void setRight(NodeTree<E> right) {
		this.right = right;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	
	
	public boolean hasRightNode() {
		if(null!=this.right) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean hasLeftNode() {
		if(null!=this.left) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "NodeTree [root=" + root + ", left=" + left + ", right=" + right + ", value=" + value + "]";
	}
	
	
	
	
}
