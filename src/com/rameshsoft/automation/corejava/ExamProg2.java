package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExamProg2 {
public static void main(String[] args) {
	
	String[] str = {"java","java","java","selenium","job","hardwork","hardwork","java","java","java","java","java"};
	
	Set set = new HashSet();
	List dup = new ArrayList();
	
	for(int i=0; i<str.length; i++)
	{
		String val = str[i];
		boolean status = set.add(val);
		if (status) {
			;;;;
		}
		else {
			dup.add(val);
		}
	}
	
	System.out.println("After removing duplicates: "+set);
	System.out.println("Removed duplicates are: "+dup);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
