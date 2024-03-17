package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListProg {
public static void main(String[] args) {
	
	//Collection collection = new Collection();
	//List list = new List();
	//Collection collection = new ArrayList();
	//List list = new ArrayList();
	
	ArrayList list = new ArrayList();
	
	list.add(456);
	list.add("java");
	list.add("java");
	list.add("job");
	list.add(null);
	list.add(456);
	list.add(456.456);
	list.add(0, 456456);
	list.add(456);
	list.add("java");
	list.add("java");
	list.add("job");
	list.add(null);
	list.add(456);
	list.add(456.456);
	list.add(0, 456456);
	
	System.out.println(list);
	Object obj = list.get(5);
	System.out.println(obj);
	
	
	
	
	
	
}
}
