package com.greatlearning.service;

import java.util.Stack;

public class BalancingBracketsAlgo {
	Stack<Character> stack;
	
	public void runAlgo(String inputString) {
		char [] array = inputString.toCharArray();
		stack = new Stack<>();
		for(int i = 0; i < array.length; i++) {
			if(array[i] == '(' || array[i] == '{' || array[i] == '[') {
				stack.push(array[i]);
			} else if(array[i] == ')' || array[i] == '}' || array[i] == ']') {
				if(!existsMatchingBracket(array[i])) {
					System.out.println("The entered Strings do not contain Balanced Brackets");
					return;
				} else {
					stack.pop();
				}
			} else {
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
		}
		System.out.println("The entered String has Balanced Brackets");
		
	}

	private boolean existsMatchingBracket(char c) {
		if(stack.isEmpty()) {
			// nothing to match
			return false;
		}
		
		switch(c) {
			case ')': return stack.peek() == '(' ? true : false;
			case '}': return stack.peek() == '{' ? true: false;
			case ']': return stack.peek() == '[' ? true: false;
			default: return false;
		}
	}
	
}