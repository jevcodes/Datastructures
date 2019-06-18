package com.ds.binarysearchtree;

public class BinarySearchTreeRunner {

	public static void main(String[] args) {
		
		BinarySearchTreeImpl<Integer> bst = new BinarySearchTreeImpl<>();
		bst.addElement(10);
		bst.addElement(4);
		bst.addElement(12);
		bst.addElement(7);
		bst.addElement(8);
		
		
		bst.search(bst.getRoot(),8);
		

	}

}
