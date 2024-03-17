package com.rameshsoft.automation.corejava;

public class CloneProg implements Cloneable{
	
	int practHrs;
	String res;
	
	public void display() {
		System.out.println(practHrs+" = "+res);
	}
	
public static void main(String[] args) throws CloneNotSupportedException {
	CloneProg prog = new CloneProg();
	Object object = prog.clone();
	CloneProg prog1 = (CloneProg) object;
	
	System.out.println(prog.hashCode());
	System.out.println(object.hashCode());
	
	prog1.practHrs = 9;
	prog1.res = "JOB";
	prog1.display();
	
	
}
}
