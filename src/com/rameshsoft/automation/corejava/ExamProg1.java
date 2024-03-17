package com.rameshsoft.automation.corejava;

import java.util.HashSet;
import java.util.Set;

public class ExamProg1 {
public static void main(String[] args) {
	
	String[] str = {"java","selenium","job","hardwork","hardwork","java","java","java","java","java"};
	
	Set set = new HashSet();
	
	for(int i=0; i<str.length; i++)
	{
		String val = str[i];
		set.add(val);
	}
	
	System.out.println(set);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
