package com.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseLinkedList {

	
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(20);
		list .add(50);
		list.add(90);
		list .add(33);
		list.add(27);
		list .add(42);
		list.add(14);
		list .add(80);
		
		System.out.println("before: ");
		list.stream().forEach(x-> System.out.print(x+ " "));
		System.out.println("\nafter: ");
		//list.remove((Integer)80);
		
		int size = list.size()-1;
		for(int x = size; x>=0;x--) {
			Integer temp =list.remove(x);
			list.add(temp);
		}
		
		list.stream().forEach(x-> System.out.print(x+ " "));
				
		//list.stream().forEach(x-> System.out.print(list.get(0)));
		
	}
	
	
	
	
}
