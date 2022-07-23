package com.virtusa.ValidParentheses.service;

import java.util.EmptyStackException;

public class ParenthesesService {
	
	private CustomStackServiceInterface customStackService;
			
	public ParenthesesService(CustomStackServiceInterface customStackService) {
		this.customStackService = customStackService;
	}

	public boolean checkParentheses(String str) {				
		for(int i=0;i<str.length();i++) {		
			char temp = str.charAt(i);
			if(temp=='(' || temp=='{' || temp =='[') {
				customStackService.push(temp);
			}			
			else if(temp==')' || temp=='}' || temp==']') {
				if(isMatchingBracket(temp)) {
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

	public boolean isMatchingBracket(char value) {		
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
