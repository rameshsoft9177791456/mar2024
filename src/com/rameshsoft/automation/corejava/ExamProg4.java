package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ExamProg4 {
public static void main(String[] args) {
	
	int[] in = {456456456,456,91456,1,56,456456,91456};
	
	
	TreeSet set = new TreeSet();
	
	for(int i=0; i<in.length; i++)
	{
		int val = in[i];
		set.add(val);
	}
	
	System.out.println(set);
	
	List list = new ArrayList(set);
	Object minVal = list.get(0);
	System.out.println("Min val is: "+minVal);
	
	Object maxVal = list.get(list.size()-1);
	System.out.println("Max val is: "+maxVal);
	
	
	
	
	
	
}
}
