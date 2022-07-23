package com.virtusa.ValidParentheses.controller;

import com.virtusa.ValidParentheses.service.ParenthesesService;

public class ParenthesesController {
	
	private ParenthesesService parenthesesService;
	
	public ParenthesesController() {
		parenthesesService = new ParenthesesService();
	}
	
	public boolean validateUserParentheses(String str) {
		return parenthesesService.checkParentheses(str);
	}

}
