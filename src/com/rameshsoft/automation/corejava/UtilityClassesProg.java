package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilityClassesProg {
public static void main(String[] args) {
	
	
	String[] str = {"java","abc","hardwork","job"};
	
	
	for(String str1 : str)
	{
		System.out.println(str1);
	}
	
	
	Arrays.sort(str);
	System.out.println("********************");
	
	
	for(String str1 : str)
	{
		System.out.println(str1);
	}
	
	int num = Arrays.binarySearch(str, "java456");
	if (num>=0) {
		System.out.println("It is a positive number: "+num);
	}
	else {
		System.out.println("It is a negative number: "+num);
	}
	
	
	
	
	/*List list = new ArrayList();
	list.add(456);
	list.add(91456);
	list.add(1);
	list.add(456);
	list.add(56);
	list.add(456);
	list.add(91456456);
	list.add(456);
	
	System.out.println(list);
	
	Collections.sort(list);
	
	System.out.println(list);
	
	System.out.println(Collections.binarySearch(list, 914564565));*/
	
	
	
	
	
	
}
}
