package com.rameshsoft.automation.corejava;

public class StringsProg {
public static void main(String[] args) {
	
	String str = "456";
	
	int val = Integer.parseInt(str); //456
	System.out.println(val);
	
	float fl = Float.parseFloat(str);
	System.out.println(fl);
	
	double dl = Double.parseDouble(str);
	System.out.println(dl);
	
	Float fl1 = Float.valueOf(fl);
	System.out.println(fl1);
	
	Integer i = Integer.valueOf(val);
	System.out.println(i);
	
	int val1 = Integer.valueOf(str);
	System.out.println(val1);
	
	
	
	
	
	
	/*String str = " java selenium ";
	String str1 = str.trim();
	System.out.println(str1);
	
	char ch = str1.charAt(0);
	System.out.println(ch);
	
	int indx = str1.indexOf("java");
	System.out.println(indx);
	
	String str2 = str1.toLowerCase();
	System.out.println(str2);
	
	String str3 = str1.toUpperCase();
	System.out.println(str3);
	
	String str4 = str1.concat("JOB");
	System.out.println(str4);
	
	int comp = str1.compareToIgnoreCase("JOB");
	System.out.println(comp);
	
	if (str1.contains("java")) {
		System.out.println("It is available java");
	}
	
	if (str1.endsWith("selenium")) {
		System.out.println("It is available ending with selenium");
	}
	
	String str5 = str1.substring(2);
	System.out.println(str5);
	
	String str6 = str1.substring(2, 5);
	System.out.println(str6);
	
	char[] ch1 = str1.toCharArray();
	
	for(char ch2 : ch1) {
		System.out.println(ch2);
	}
	
	String[] str7 = str1.split(" ");
	for(String str8 : str7) {
		System.out.println(str8);
	}
	
	String str9 = str1.replace('a', 'A');
	System.out.println(str9);
	
	String str10 = str1.replace("java", "JAVA");
	System.out.println(str10);
	
	String str11 = str1.replaceAll("java", "JAVA JOB");
	System.out.println(str11);*/
	
		
}
}
