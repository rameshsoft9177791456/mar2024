package com.rameshsoft.automation.corejava;


public class LangPackageTest {
	
	@Override
	public int hashCode() {
		return 456;
	}
	@Override
	public String toString() {
		return "Hardwork = Job";
	}
	
public static void main(String[] args) {
	
	LangPackageTest test = new LangPackageTest();
	int hs = test.hashCode();
	System.out.println(hs);
	
	String str = test.toString();
	System.out.println(str);
	
	System.out.println(test.getClass().getName());
	
	
}
}
