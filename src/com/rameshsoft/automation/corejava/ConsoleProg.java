package com.rameshsoft.automation.corejava;

import java.util.Scanner;

public class ConsoleProg {
	
	int practHrs;
	String res;
	
	public void hardwork() {
		System.out.println(practHrs+"     "+res);
	}
	
public static void main(String[] args) {
	
	ConsoleProg prog = new ConsoleProg();
	
	System.out.println("Enter practice hours");
	Scanner scanner = new Scanner(System.in);
	int practiceHours = scanner.nextInt();
	
	System.out.println("Enter the result");
	String result = scanner.next();
	
	prog.practHrs = practiceHours;
	prog.res = result;
	
	prog.hardwork();
	
	
	
}
}
