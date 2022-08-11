package com.virtusa.ValidParentheses.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.EmptyStackException;

import org.junit.Test;

import com.virtusa.ValidParentheses.model.CustomStack;

public class CustomStackServiceTest 
{
	CustomStackService customStackService;
	
	@Test
	public void top_ReturnsMockElement_Test()
	{    	
		customStackService = mock(CustomStackService.class);
		when(customStackService.top()).thenReturn('a');
		assertEquals('a', customStackService.top());
	}	
	
	@Test
    public void pop_ReturnsMockElement_Test()
    {    	
    	customStackService = mock(CustomStackService.class);
    	when(customStackService.pop()).thenReturn('a');
        assertEquals('a', customStackService.pop());
    }
		
	
    @Test(expected = EmptyStackException.class)
    public void top_ThrowsAnException_StackIsEmpty()
    {    	
    	CustomStack customStack = mock(CustomStack.class);
    	customStackService = new CustomStackService(customStack);
        customStackService.top();
    }
    
    @Test(expected = EmptyStackException.class)
    public void pop_ThrowsAnException_StackIsEmpty()
    {    	
       	CustomStack customStack = mock(CustomStack.class);
    	customStackService = new CustomStackService(customStack);
        customStackService.pop();
    }
    
 
    @Test
    public void push_IncreaseSize_IfElementIsPushed() {
    	
       	CustomStack customStack = spy(CustomStack.class);
    	customStackService = new CustomStackService(customStack);
    	
    	assertEquals(0, customStackService.size());
    	
        customStackService.push('a');
        customStackService.push('b');
    	   	
    	assertEquals(2, customStackService.size());
    }
          
    @Test
    public void top_ReturnsLastElement_StackContainsElement()
    {    	
    	
       	CustomStack customStack = spy(CustomStack.class);
    	customStackService = new CustomStackService(customStack);
    	customStackService.push('a');
        customStackService.push('b');
        customStackService.push('c');
        customStackService.pop();
        
        assertEquals('b', customStackService.top());
    }
    
    @Test
    public void pop_ReturnsLastElement_StackContainsElement()
    {    	
       	CustomStack customStack = spy(CustomStack.class);
    	customStackService = new CustomStackService(customStack);
        customStackService.push('a');
        customStackService.push('b');
        customStackService.push('c');
        assertEquals('c', customStackService.pop());
    }
      
}
