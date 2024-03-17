package com.rameshsoft.automation.corejava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapProg {
public static void main(String[] args) {
	
	/*//Map map = new HashMap();
	HashMap map = new HashMap();
	map.put("java", 456);
	map.put(91456, 456);
	map.put("hardwork", "job");
	map.put('g', 91456);
	map.put("java", "hardwork");
	map.put(null, null);
	map.put("hardwork", "job");
	
	System.out.println(map);
	
	
	LinkedHashMap map1 = new LinkedHashMap();
	map1.put("java", 456);
	map1.put(91456, 456);
	map1.put("hardwork", "job");
	map1.put('g', 91456);
	map1.put("java", "hardwork");
	map1.put(null, null);
	map1.put("hardwork", "job");
	
	System.out.println(map1);
	*/
	
	/*IdentityHashMap map = new IdentityHashMap();
	map.put("java", 456);
	map.put(91456, 456);
	map.put("hardwork", "job");
	map.put('g', 91456);
	map.put("java", "hardwork");
	map.put(null, null);
	map.put("hardwork", "job");
	
	System.out.println(map);*/
	
	
	/*ConcurrentHashMap map = new ConcurrentHashMap();
	
	map.put("java", 456);
	map.put(91456, 456);
	map.put("hardwork", "job");
	map.put('g', 91456);
	map.put("java", "hardwork");
	//map.put(null, null);
	//map.put(null, "hardwork");
	//map.put("practice", null);
	map.put("hardwork", "job");
	
	System.out.println(map);
	*/
	
	
	/*Hashtable map = new Hashtable();
	map.put("java", 456);
	map.put(91456, 456);
	map.put("hardwork", "job");
	map.put('g', 91456);
	map.put("java", "hardwork");
	//map.put(null, null);
	//map.put(null, "hardwork");
	//map.put("practice", null);
	map.put("hardwork", "job");*/
	
	//Map map = new TreeMap();
	
	TreeMap map = new TreeMap();
	
	//map.put(null, null);
	//map.put(null, "hello");
	map.put("java", null);
	map.put("abc", 91456);
	map.put("hardwork", "JOB");
	map.put("subject", "java with selenium");
	map.put("practice", "JOB");
	
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
