package com.ds.stackexample.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapExample {

	public static void main(String[] args) {
	
	/*int[] abc =  new int[8];
	
	abc[1] = 5;
	abc[2] = 10;
	
	for (int a : abc) {
		System.out.println(a);
	}
	
	
	Heap example = new Heap(new int[] {19,5,4,7,10,11,22,16}) ;
	example.print();*/
	
	Queue<Integer> heap = new PriorityQueue<>((a,b)->b.compareTo(a));
	
	heap.add(40);
	heap.add(20);
	heap.add(18);
	heap.add(45);
	heap.add(27);
	
	System.out.println(heap.peek());
	
	
	}
	
}




class Heap{
	int[] intArray;
	int pointer=0;
	
	public Heap(int[] values) {
		intArray = values;
		pointer = values.length-1;
	}

	public int[] getValues() {
		return intArray;
	}

	public void add(int x){
		int newSize = intArray.length + 1;
		
	}
	
	public void heapify() {
		
	}
	
	
	public void print(){
		for (int x =0; x<intArray.length; x++) {
			if(x == 0 ) {
				System.out.println("Head : " + intArray[x] );
			}
			else 
			{
				System.out.println("\n Node: " + intArray[x] );
				System.out.println("Parent: " + intArray[x/2] );
				if(intArray.length > (2*x+2)) {
					System.out.println("Left Child : " + intArray[2*x+1]+ "\t Right Child : " + intArray[2*x+2]);
					
					
				}
			}
		}
	}
	
	
	
	
}