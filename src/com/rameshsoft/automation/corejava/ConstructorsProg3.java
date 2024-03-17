package com.rameshsoft.automation.corejava;

class ConstructorProg4
{
	int practHrs = 15;
	String result = "JOB";
}
class ConstructorProg3 extends ConstructorProg4
{
	int practHrs;
	String result;
	
	public ConstructorProg3(int hrs,String res){
		this.practHrs = hrs;
		this.result = res;
	}
	public ConstructorProg3() {
		System.out.println("Default constructor");
	}
	public void hardwork() {
		int practHrs = 4;
		String result = "Do Practice";
		System.out.println(practHrs+"  =  "+result); //4  Do Practice
		System.out.println(this.practHrs+"  =  "+this.result); //9  JOB
		System.out.println(super.practHrs+"  =  "+super.result); //15 JOB
	}
}
public class ConstructorsProg3 {
public static void main(String[] args) {
	
	ConstructorProg3 prog = new ConstructorProg3(9,"JOB");
	prog.hardwork();
	
}
}
