package com.virtusa.ValidParentheses.controller;

import com.virtusa.ValidParentheses.service.ParenthesesService;

public class ParenthesesController {
	
	private ParenthesesService parenthesesService;
	
	public ParenthesesController(ParenthesesService parenthesesService) {
		this.parenthesesService = parenthesesService;
	}
	
	public boolean validateUserParentheses(String str) {
		return parenthesesService.checkParentheses(str);
	}

}
