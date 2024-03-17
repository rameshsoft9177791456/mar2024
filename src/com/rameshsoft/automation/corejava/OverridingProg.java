package com.rameshsoft.automation.corejava;

class Parent
{
	final int practHrs = 9;
	
	public void enjoy() {
		System.out.println("PC: ENJOY");
	}
	public void job() {
		System.out.println("PC: JOB");
	}
	public void marriage() {
		System.out.println("PC: MARRIAGE");
	}
	static public void education() {
		System.out.println("PC: EDUCATION");
	}
}
class Child extends Parent
{
	//method hiding
	static public void education() {
		System.out.println("CC: I DON'T DO EDUCATION");
	}
	@Override
	public void marriage() {
		System.out.println("CC: I WILL MARRY LATER: MARRIAGE");
	}
	public void friends() {
		System.out.println("CC: FRIENDS");
	}
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;//200 METHODS
}
public class OverridingProg {
public static void main(String[] args) {
	/*Parent parent = new Parent();
	parent.enjoy();
	parent.job();
	parent.marriage();
	parent.education();*/
	
	/*Child child = new Child();
	child.enjoy();
	child.job();
	child.marriage();
	child.education();
	child.friends();*/
	
	Parent parent = new Child();
	parent.enjoy();
	parent.job();
	parent.marriage();//cc
	parent.education(); //pc
	
	
	
	
}
}
