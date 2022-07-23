package com.virtusa.ValidParentheses.service;

import java.util.EmptyStackException;

import com.virtusa.ValidParentheses.model.CustomStack;
import com.virtusa.ValidParentheses.model.Node;

public class CustomStackService {
	
	private CustomStack stack;
	
	public CustomStackService() {
		stack = new CustomStack();
	}
	
	public void push(char value) {
		
		Node temp = new Node(value);
		temp.setNext(stack.getHeadStack());
		stack.setHeadStack(temp);
		int tempSize = stack.getSize();
		stack.setSize(++tempSize);
	}
	
	public char top() {
		
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			return stack.getHeadStack().getData();
		}
	
	}
	
	public char pop() {
		if(this.isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			char removedData = stack.getHeadStack().getData();
			Node newHead = stack.getHeadStack().getNext();
			stack.setHeadStack(newHead);
			int tempSize = stack.getSize();
			stack.setSize(--tempSize);
			return removedData;
		}
	}

	public boolean isEmpty() {
		if(stack.getSize()==0 || stack.getHeadStack()==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
