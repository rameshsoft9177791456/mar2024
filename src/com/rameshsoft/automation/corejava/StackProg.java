package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class StackProg {
public static void main(String[] args) {
	
	//Collection collection = new Stack();
	//List list = new Stack();
	
	Stack stack = new Stack();
	stack.add(456);
	stack.add(0, "JOB");
	stack.addElement("Hardwork");
	stack.push("practice");
	stack.add(null);
	stack.add(456);
	stack.add(456);
	stack.add("JOB");
	stack.add("JOB");
	
	System.out.println(stack);
	
	
	
	
	
	
	
	
	
}
}
