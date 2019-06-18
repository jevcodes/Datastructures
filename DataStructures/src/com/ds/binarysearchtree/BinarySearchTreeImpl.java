package com.ds.binarysearchtree;

import com.ds.Node;

public class BinarySearchTreeImpl<E extends Comparable<E>> {

	NodeTree<E> root;

	public BinarySearchTreeImpl() {
		// TODO Auto-generated constructor stub
	}

	public BinarySearchTreeImpl(NodeTree<E> root) {
		super();
		this.root = root;
	}

	public NodeTree<E> getRoot() {
		return root;
	}

	public void setRoot(NodeTree<E> root) {
		this.root = root;
	}

	public void addElementHelper(E value, NodeTree<E> n) {
		if (0 < n.getValue().compareTo(value)) {
			if (null != n.getLeft()) {
				addElementHelper(value, n.getLeft());
			} else {
				NodeTree<E> newNode = new NodeTree<>(n, null, null, value);
				n.setLeft(newNode);
			}
		} else if (0 >= n.getValue().compareTo(value)) {
			if (null != n.getRight()) {
				addElementHelper(value, n.getRight());
			} else {
				NodeTree<E> newNode = new NodeTree<>(n, null, null, value);
				n.setRight(newNode);
			}
		}
	}
	
	
	public NodeTree<E> searchUntilNull(E value, NodeTree<E> n) {
		if (0 < n.getValue().compareTo(value)) {
			if (null != n.getLeft()) {
				return searchUntilNull(value, n.getLeft());
			} else {
				return n;
			}
		} else  {
			if (null != n.getRight()) {
				return searchUntilNull(value, n.getRight());
			} else {
				return n;
			}
		}
	}

	public void addElement(E element) {
		if (null == this.root) {
			this.root = new NodeTree<>(null, null, null, element);
		} else {
		//	addElementHelper(element, this.root);
			NodeTree<E> outerChild = searchUntilNull(element, this.root);
			NodeTree<E> newNode = new NodeTree<>(outerChild,null,null,element);
			if(0<outerChild.getValue().compareTo(newNode.getValue())) {
				outerChild.setLeft(newNode);
			}
			else {
				outerChild.setRight(newNode);
			}
		}
	}

	public NodeTree<E> search(NodeTree<E> root, E value) {
		System.out.println(root.getValue());
		if(0<root.getValue().compareTo(value)) {
			if(root.hasLeftNode()) {
				return search(root.getLeft(), value);
			}
		}
		else if(0>root.getValue().compareTo(value)) {
			if(root.hasRightNode()) {
			 return	search(root.getRight(), value);
			}
		}
		else if (0 ==root.getValue().compareTo(value) ) {
			return root;
		}
			
		else {
			System.out.println("Value is not found");
			return null;
		}
		System.out.println("Value is not found");
		return null;
	}

}
