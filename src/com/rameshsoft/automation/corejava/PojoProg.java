package com.rameshsoft.automation.corejava;

class PojoTest
{
	private int practHrs = 9;
	private String res = "JOB";
	private double sal = 1450000;
	
	public int getPractHrs() {
		return practHrs;
	}
	public String getRes() {
		return res;
	}
	public double getSal() {
		return sal;
	}
}
public class PojoProg {
public static void main(String[] args) {
	PojoTest test = new PojoTest();
	System.out.println(test.getPractHrs());
	System.out.println(test.getRes());
	System.out.println(test.getSal());
	
}
}


