package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProg {
public static void main(String[] args) {
	
	//Collection collection = new LinkedList<>();
	//List list = new LinkedList<>();
	
	LinkedList list = new LinkedList();
	list.add(456);
	list.add(0, "JOB");
	list.addFirst("Do Hardwork");
	list.add(456);
	list.add(456);
	list.add(null);
	list.add(456);
	list.add(456);
	list.addLast(456);
	list.add("practice");
	
	System.out.println(list);
	
	Object obj5 = list.get(5);
	System.out.println(obj5);
	
	Object obj1 = list.getFirst();
	System.out.println(obj1);
	
	
	Object last = list.getLast();
	System.out.println(last);
	
	
	

	
	
	
}
}
