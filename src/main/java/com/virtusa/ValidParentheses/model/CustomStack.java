package com.virtusa.ValidParentheses.model;

public class CustomStack {
	
	private Node headStack;
	private int size;
	
	public CustomStack() {
		headStack = null;
		size=0;
	}
	
	public void setHeadStack(Node headStack) {
		this.headStack = headStack;
	}
	

	public void setSize(int size) {
		this.size = size;
	}

	public Node getHeadStack() {
		return headStack;
	}

	public int getSize() {
		return size;
	}
		
}



