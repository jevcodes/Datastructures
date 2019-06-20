package com.ds.stackexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {

		Stack<Character> s = new Stack<>();

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			/*for (int x = 0; x < input.length(); x++) {
				if (s.isEmpty() && '(' != input.charAt(x) || '{' != input.charAt(x)) {
					if ('(' == input.charAt(x) || '{' == input.charAt(x)) {
						s.push(String.valueOf(input.charAt(x)));
					} else if ('(' != input.charAt(x) || '{' != input.charAt(x)) {
						if (!s.pop().equals(String.valueOf(input.charAt(x)))) {
							System.out.println("This is not balanced");
							break;
						}

					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
*/
			
			System.out.println(Solution.isBalanced(input.toCharArray()));
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Solution.isBalanced();
		
	}

}

class Solution {
	
	public static boolean isBalanced(char[] s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int x = 0; x<s.length;x++) {
			if(stack.isEmpty() && (s[x] == '}' || s[x] ==')') )
				return false;
			
			if(s[x] == '(' || s[x] == '{') {
				stack.push(s[x]);
			}
			if(s[x] == '}' || s[x] ==')') {
				if(!(stack.pop() == translate(s[x]))) {
					return false;
				}
			}
			
		}
		
		if (stack.empty()){
			return true;
		}
		return false;
		
	}
	
	
	public static char translate(char c) {
		/*if(c==')') {
			return '(';
		}
		else if (c=='}') {
			return '{';
		}
		
		return ' ';*/
		
		switch (c) {
		case ')':
		{
			return '(';
		}
		case '}':
		{
			return '{';
		}
		default:
			return ' ';
			
		
		}
		
	}
	
}

