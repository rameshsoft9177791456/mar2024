package com.rameshsoft.automation.corejava;

abstract class ReadOnlyTest
{
	static int practHrs = 9;
	static String res = "JOBS";
	
	static public void hardwork() {
		System.out.println(practHrs+"  =  "+res);
	}
}

public class ReadOnlyProg {
public static void main(String[] args) {
	System.out.println(ReadOnlyTest.practHrs);
	System.out.println(ReadOnlyTest.res);
	ReadOnlyTest.hardwork();
	
}
}

