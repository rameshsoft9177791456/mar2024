package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetProg {
public static void main(String[] args) {
	
	//Collection collection = new HashSet();
	
	//Set set = new HashSet();
	
	//HashSet set = new HashSet();
	
	LinkedHashSet set = new LinkedHashSet();
	
	System.out.println(set.add(456));;
	System.out.println(set.add(456));
	System.out.println(set.add("java"));
	System.out.println(set.add("job"));
	System.out.println(set.add("java"));
	System.out.println(set.add(456.456));
	System.out.println(set.add("java"));
	System.out.println(set.add(null));
	System.out.println(set.add(456.456f));
	System.out.println(set.add("practice"));
	
	System.out.println(set);
	
	
	
	
	
	
	
}
}
