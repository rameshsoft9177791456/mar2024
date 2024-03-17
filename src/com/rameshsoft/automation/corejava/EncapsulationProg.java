package com.rameshsoft.automation.corejava;

class TightlyEncapProg
{
	private int practHrs = 9;
	private String res = "JOB";
	
	public int getPractHrs() {
		return practHrs;
	}

	public String getRes() {
		return res;
	}

	public void hardwork() {
		System.out.println(practHrs+" = "+res);
	}
}
public class EncapsulationProg {
public static void main(String[] args) {
	TightlyEncapProg prog = new TightlyEncapProg();
	//prog.practHrs = 0;
	//prog.res = "NO JOB";
	prog.hardwork();
	System.out.println(prog.getPractHrs());
	System.out.println(prog.getRes());
}
}
