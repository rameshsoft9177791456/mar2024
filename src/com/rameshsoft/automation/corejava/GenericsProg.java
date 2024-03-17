package com.rameshsoft.automation.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsProg {
	
	public List<Integer> hardwork() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(456);
		list.add(91456);
		list.add(56);
		//list.add("java"); CE
		list.add(1);
		list.add(456);
		return list;
	}
	public void job(Set set) {
		System.out.println(set);
	}
	
public static void main(String[] args) {
	GenericsProg prog = new GenericsProg();
	List<Integer> list = prog.hardwork();
	System.out.println(list);
	
	Set set = new HashSet<>();
	set.add(456);
	set.add("java");
	set.add(91456);
	set.add(456);
	prog.job(set);
	
	
	/*for(int i : list)
	{
		if (i == 456) {
			System.out.println("  Do practice well");
		}
		System.out.println(i);
	}
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("java");
	hs.add("selenium");
	hs.add("job");
	hs.add("hardwork");
	//hs.add(456);
	
	Iterator<String> itr = hs.iterator();
	while(itr.hasNext()) {
		String str = itr.next();
		if (str.equalsIgnoreCase("hardwork")) {
			System.out.println("    Do hardwork");
		}
		System.out.println(str);
	}
	
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("java", 456);
	map.put("selenium", 456456);
	map.put("job", 91456);
	map.put("java", 456);
	map.put("hardwork", 456);
	
	System.out.println(map);*/
	
	
	
	
}
}
