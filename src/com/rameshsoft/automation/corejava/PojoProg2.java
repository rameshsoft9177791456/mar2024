package com.rameshsoft.automation.corejava;

class PojoTest2
{
	private int practHrs;
	private String res;
	private double sal;
	
	public void setPractHrs(int practHrs) {
		this.practHrs = practHrs;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
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
public class PojoProg2 {
public static void main(String[] args) {
	
	PojoTest2 test = new PojoTest2();
	test.setPractHrs(9);
	test.setRes("JOB");
	test.setSal(1350000);
	
	System.out.println(test.getPractHrs());
	System.out.println(test.getRes());
	System.out.println(test.getSal());
	
	
}
}


