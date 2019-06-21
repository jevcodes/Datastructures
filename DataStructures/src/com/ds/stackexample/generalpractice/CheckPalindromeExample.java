package com.ds.stackexample.generalpractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckPalindromeExample {

public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String input = br.readLine();
			
			System.out.println(CheckPalindrome.checkPalindrome(input));
			
		}catch (Exception e) {
			
		}
		
	}
	
}

class CheckPalindrome{
	
	public static boolean checkPalindrome(String s){
		s =s.toLowerCase();
		char[] c = s.toCharArray();
		int endPointer = c.length-1;
		int startPointer = 0;
		
		while (startPointer <= endPointer) {
			if(c[startPointer] != c[endPointer]) {
				
				
				return false;
			}
			startPointer++;
			endPointer--;
		}
		
		return true;
		
		
	}
}


