package com.rameshsoft.automation.corejava;

class ConstructorProg1
{
	int practHrs;
	String result;
	
	public ConstructorProg1(int practHrs,String result){
		this.practHrs = practHrs;
		this.result = result;
	}
	public void hardwork() {
		System.out.println(practHrs+"  =  "+result);
	}
}
public class ConstructorsProg2 {
public static void main(String[] args) {
	
	ConstructorProg1 prog = new ConstructorProg1(9,"JOB");
	prog.hardwork();
	
	ConstructorProg1 prog1 = new ConstructorProg1(0,"SUNNA");
	prog1.hardwork();
	
	ConstructorProg1 prog2 = new ConstructorProg1(5,"PRACTICE");
	prog2.hardwork();
	
	ConstructorProg1 prog3 = new ConstructorProg1(15,"JOBS");
	prog3.hardwork();
	
}
}
