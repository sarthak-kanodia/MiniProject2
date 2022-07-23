package com.virtusa.ValidParentheses.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.EmptyStackException;

import org.junit.Test;


public class ParenthesesServiceTest 
{
	ParenthesesService parenthesesService;
	
	@Test
	public void checkParentheses_ReturnsTrue_IfStringEmpty()
	{    	
		CustomStackServiceInterface customStackServiceInterface = mock(CustomStackServiceInterface.class);
		parenthesesService = new ParenthesesService(customStackServiceInterface);
		when(customStackServiceInterface.isEmpty()).thenReturn(true);
		assertEquals(true, parenthesesService.checkParentheses(""));
	}
	
	
	
	@Test
	public void isMatchingBracket_ReturnsTrue_ForMatchingBrackets()
	{    	
		CustomStackServiceInterface customStackService  = mock(CustomStackServiceInterface.class);
		parenthesesService = new ParenthesesService(customStackService);
		when(customStackService.pop()).thenReturn('(','{','[');
		assertEquals(true, parenthesesService.isMatchingBracket(')'));
		assertEquals(true, parenthesesService.isMatchingBracket('}'));
		assertEquals(true, parenthesesService.isMatchingBracket(']'));
		
	}
	
	@Test
	public void isMatchingBracket_ReturnsFalse_ForNonMatchingBrackets()
	{    	
		CustomStackServiceInterface customStackService  = mock(CustomStackServiceInterface.class);
		parenthesesService = new ParenthesesService(customStackService);
		when(customStackService.pop()).thenReturn('(','{','[');
		assertEquals(false, parenthesesService.isMatchingBracket('}'));
		assertEquals(false, parenthesesService.isMatchingBracket(']'));
		assertEquals(false, parenthesesService.isMatchingBracket(')'));
		
	}
	
	@Test
	public void isMatchingBracket_ReturnsFalse_ForEmptyStack()
	{    	
		CustomStackServiceInterface customStackService  = mock(CustomStackServiceInterface.class);
		parenthesesService = new ParenthesesService(customStackService);
		when(customStackService.pop()).thenThrow(new EmptyStackException());
		assertEquals(false, parenthesesService.isMatchingBracket(')'));
		assertEquals(false, parenthesesService.isMatchingBracket('}'));
		assertEquals(false, parenthesesService.isMatchingBracket(']'));
	
	}
	
    
}
