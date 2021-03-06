package com.niji.string;

import java.util.HashMap;
import java.util.Stack;

public class Braces {
	
	public static boolean isValid(String braces) {
		
		  HashMap<Character, Character> map = new HashMap<Character, Character>();
		  map.put('{', '}');
		  map.put('(', ')');
		  map.put('[', ']');
			
		 
			Stack<Character> stack = new Stack<Character>();
		 
			for (int i = 0; i < braces.length(); i++) {
				char curr = braces.charAt(i);
		 
				if (map.keySet().contains(curr)) {
					stack.push(curr);
				} 
				else if (map.values().contains(curr)) {
					if (!stack.empty() && map.get(stack.peek()) == curr) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		 
			return stack.empty();
		    
		    }
	  

	
}
