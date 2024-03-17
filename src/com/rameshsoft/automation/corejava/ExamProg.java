package com.rameshsoft.automation.corejava;

public class ExamProg {
public static void main(String[] args) {
	
	String str = "JOB";
	String str1 =str.concat("HARDWORK");
	
	System.out.println(str);
	System.out.println(str1);
	
	System.out.println(str.hashCode());
	System.out.println(str1.hashCode());
	
	System.out.println("***************");
	
	StringBuffer sb1 = new StringBuffer("Practice");
	StringBuffer sb2 = sb1.append("JOB");
	
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println(sb1.hashCode());
	System.out.println(sb2.hashCode());
	
	
	if (sb1 == sb2) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not equal");
	}
	
	
	
	
	
	
	
	
	
}
}
