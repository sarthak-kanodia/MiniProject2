package com.virtusa.ValidParentheses.controller;

import com.virtusa.ValidParentheses.service.ParenthesesService;
import com.virtusa.ValidParentheses.service.ParenthesesServiceInterface;

public class ParenthesesController {
	
	private ParenthesesServiceInterface parenthesesService;
	
	public ParenthesesController(ParenthesesService parenthesesService) {
		this.parenthesesService = parenthesesService;
	}
	
	public boolean validateUserParentheses(String str) {
		return parenthesesService.checkParentheses(str);
	}

}
