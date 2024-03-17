package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListProg {
public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add(456);
	list.add(91456);
	list.add(456456);
	list.add(56);
	list.add(456);
	
	Iterator itr = list.iterator();
	
	while(itr.hasNext())
	{
		Object obj = itr.next();
		Integer i = (Integer) obj;
		if (i == 456) {
			System.out.println("Hello");
		}
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
