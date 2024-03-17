package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.List;

public class ForEachProg {
public static void main(String[] args) {
	
	/*String[] str = {"java","selenium","hardwork","job"};
	
	for(String str1 : str)
	{
		if (str1.equalsIgnoreCase("hardwork")) {
			System.out.println("     JOB IS IN YOUR HAND");
		}
		System.out.println(str1);
	}*/
	
	List list = new ArrayList();
	list.add(456);
	list.add(91456);
	list.add(56);
	list.add(1);
	list.add(456);
	
	
	for(Object obj : list)
	{
		Integer i = (Integer) obj;
		if (i == 456) {
			System.out.println(" Do hardwork");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

