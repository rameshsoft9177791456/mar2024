package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class VectorProg {
public static void main(String[] args) {
	
	//Collection collection = new Vector();
	//List list = new Vector();
	
	Vector vector = new Vector();
	vector.addElement("JOB");
	vector.add(456);
	vector.add(0, "Hardwork");
	vector.add(456);
	vector.add(null);
	vector.add("JOB");
	vector.add("JOB");
	vector.add("JOB");
	vector.add("JOB");
	
	System.out.println(vector);
	
}
}
