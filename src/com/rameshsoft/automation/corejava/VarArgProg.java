package com.rameshsoft.automation.corejava;

public class VarArgProg {
	
	public void offersPage(String str) {
		System.out.println("1 arg method");
	}
	public void offersPage(int i,String... str) {
		System.out.println("Var arg method");
	}
	
public static void main(String[] args) {
	
	VarArgProg arg = new VarArgProg();
	arg.offersPage(4);
	arg.offersPage("JOB");
	arg.offersPage(95,"JOB","Java");
	arg.offersPage(2500,"JOB","java","selenium");
	arg.offersPage(250,"JOB","subject","practice","hardwork");
	
}
}

