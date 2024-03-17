package com.rameshsoft.automation.corejava;

class PojoTest3
{
	private int practHrs;
	private String res;
	private double sal;
	private String hardwork;
	
	public void setPractHrs(int hrs) {
		//this.practHrs = hrs;
		practHrs = hrs;
	}
	public String getHardwork() {
		return hardwork;
	}
	public void setHardwork(String hardwork) {
		this.hardwork = hardwork;
	}
	public void setRes(String result) {
		//this.res = result;
		res = result;
	}
	public void setSal(double salary) {
		//this.sal = salary;
		sal = salary;
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
public class PojoProg3 {
public static void main(String[] args) {
	
	PojoTest3 test = new PojoTest3();
	test.setPractHrs(9);
	test.setRes("JOB");
	test.setSal(1350000);
	
	System.out.println(test.getPractHrs());
	System.out.println(test.getRes());
	System.out.println(test.getSal());
	
	
}
}


