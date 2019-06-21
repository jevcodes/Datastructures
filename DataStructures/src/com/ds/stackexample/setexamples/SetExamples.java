package com.ds.stackexample.setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SetExamples {

	public static void main(String[] args) {
		
	//	Set<String> s = new LinkedHashSet<>();
	//	Set<String> s = new HashSet<>();
		
		Set<String> s = new TreeSet<>();
		
		s.add("b");
		s.add("c");
		s.add("f");
		s.add("d");
		s.add("o");	
		for(int x=0;x<1000;x++) {
			if (x%3 ==1) {
				s.add("r"+x);
			}
			else
				s.add("e" + x);
		}
		
		s.stream().forEach(x->System.out.println(x));
		System.out.println("sorted\n");
		s.stream().collect(Collectors.toList()).stream().
			sorted((a,b)->a.compareTo(b)).forEach(x->System.out.println(x));
		
		
		//String deliminatedWithComma = s.stream().map().collect(Collectors.joining(",")).;
		
		String deliminatedWithComma = s.stream().parallel().collect(Collectors.joining(","));
		
		System.out.println(" list is " + deliminatedWithComma);
		
		
		
	}
	
}
