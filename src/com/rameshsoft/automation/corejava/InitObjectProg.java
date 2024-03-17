package com.rameshsoft.automation.corejava;

public class InitObjectProg {
	
	int practHrs;
	String res;
	
	public void hardwork() {
		System.out.println(practHrs+" ********* "+res);
	}
	
public static void main(String[] args) {
	
	InitObjectProg prog = new InitObjectProg();
	prog.practHrs = 6;
	prog.res = "JOB";
	prog.hardwork();
	
	InitObjectProg prog1 = new InitObjectProg();
	prog1.practHrs = 9;
	prog1.res = "JOBS";
	prog1.hardwork();
	
	InitObjectProg prog2 = new InitObjectProg();
	prog2.practHrs = 12;
	prog2.res = "JOBS";
	prog2.hardwork();
	
	InitObjectProg prog3 = new InitObjectProg();
	prog3.practHrs = 15;
	prog3.res = "JOBS";
	prog3.hardwork();
	
}
}
