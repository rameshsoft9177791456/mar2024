package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class ListProg2 {
public static void main(String[] args) {
	
	/*List list = new ArrayList();
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	list.add("practice");
	System.out.println(list);*/
	
	Set set = new HashSet();
	set.add(456);
	set.add(1);
	set.add(456);
	set.add(91456);
	set.add(456);
	set.add(456);
	System.out.println(set);
	
	Iterator itr1 = set.iterator();
	while(itr1.hasNext()) {
		Object obj = itr1.next();
		Integer i = (Integer) obj;
		if (i == 456) {
			System.out.println("  Do practice");
		}
		System.out.println(i);
	}
	
	/*Iterator itr = list.iterator();
	
	while(itr.hasNext()) {
		Object obj = itr.next();
		String str = (String) obj;
		if (str.equalsIgnoreCase("hardwork")) {
			System.out.println("    Job is in your hand");
		}
		System.out.println(str);
	}*/
	
	
	
	
	
	/*ListIterator itr = list.listIterator();
	
	while(itr.hasNext()) {
		Object obj = itr.next();
		String str = (String) obj;
		if (str.equalsIgnoreCase("hardwork")) {
			System.out.println("    Job is in your hand");
		}
		System.out.println(str);
	}*/
	
	/*Enumeration enu = list.elements();
	
	while(enu.hasMoreElements())
	{
		Object obj = enu.nextElement();
		String str = (String) obj;
		if (str.equalsIgnoreCase("hardwork")) {
			System.out.println("    Job is in your hand");
		}
		System.out.println(str);
	}*/
	
	/*List list = new ArrayList();
	list.add("java");
	list.add("selenium");
	list.add("hardwork");
	list.add("job");
	list.add("practice");
	System.out.println(list);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
