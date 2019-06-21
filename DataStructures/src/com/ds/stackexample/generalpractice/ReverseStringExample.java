package com.ds.stackexample.generalpractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReverseStringExample {

	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String input = br.readLine();
			
			
			System.out.println(Reverse.reverseString(input));
			
			//using String Buffer
			StringBuffer b = new StringBuffer(input);
			
			System.out.println(Recursive.reverse(input));
			
			
		}catch (Exception e) {
			
		}
		
		
		
		
	}
	
}
class Recursive{
	
	public static String reverse(String s) {
		
		StringBuffer b = new StringBuffer();
		
		return reverseImp(s,b).toString();
		
	}
	
	
	public static StringBuffer reverseImp(String s, StringBuffer b) {
			b=b.append(s.charAt(s.length()));
			System.out.println(b.append(s.charAt(s.length())));
			if(0!=s.length())
			return reverseImp(s.substring(0, s.length()), b);
			else
				return b;
		
	}
	
}



class Reverse{
	public static String reverseString(String s) {
		char[] stringAsChar = s.toCharArray();
		String returnValue = "";
		for (char c : stringAsChar) {
			returnValue = c + returnValue;
		}
		
		return returnValue;
	}
}