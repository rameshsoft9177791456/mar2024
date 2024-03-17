package com.rameshsoft.automation.corejava;

class ThisSuperConstructors1
{
	public ThisSuperConstructors1() {
		System.out.println("PC: DC");
	}
	public ThisSuperConstructors1(String res) {
		this();
		System.out.println("PC: 1 PC :"+res);
	}
}
public class ThisSuperConstructorsProg extends ThisSuperConstructors1{
	public ThisSuperConstructorsProg() {
		this(9);
		System.out.println("CC: DC");
	}
	public ThisSuperConstructorsProg(int practHrs) {
		super("JOB");
		System.out.println("CC: 1 PC: "+practHrs);
	}
public static void main(String[] args) {
	
	
	ThisSuperConstructorsProg prog = new ThisSuperConstructorsProg();
	
	
}
}
