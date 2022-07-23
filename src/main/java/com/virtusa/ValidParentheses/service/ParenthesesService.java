package com.virtusa.ValidParentheses.service;

import java.util.EmptyStackException;

public class ParenthesesService {
	
	private CustomStackService customStackService;
	
	public ParenthesesService() {
		customStackService = new CustomStackService();
	}
	
	public boolean checkParentheses(String str) {
		
		for(int i=0;i<str.length();i++) {
			
			char temp = str.charAt(i);
			
			if(temp=='(' || temp=='{' || temp =='[') {
				customStackService.push(temp);
			}
			
			else if(temp==')' || temp=='}' || temp==']') {
				if(isMatchingBrackets(temp)) {
					continue;
				}
				else {
					return false;
				}
			}
			
		}
		
		if(!customStackService.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
	}


	private boolean isMatchingBrackets(char value) {
		
		try {			
			char tempChar = customStackService.pop();
			if(tempChar=='(' && value==')') {
				return true;
			}
			else if(tempChar=='{' && value=='}') {
				return true;
			}
			else if(tempChar=='[' && value==']') {
				return true;
			}
			else {
				return false;
			}
		}
		catch(EmptyStackException e) {
			return false;
		}
		
	}
	
}
