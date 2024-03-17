package com.rameshsoft.automation.corejava;

public class StringRevProg {
public static void main(String[] args) {
	
	String str = "ADP456Selenium";
	//4 + 5 + 6 = 15 
	
	int sum = 0;
	
	for(int i=0; i<str.length(); i++)
	{
		char ch = str.charAt(i); //'S'
		if (Character.isDigit(ch)) {
			int val = Character.getNumericValue(ch); //6
			sum = sum + val; //sum = 15
		}
	}
	System.out.println("SUM IS: "+sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String str = "java selenium hardwork job";
	
	String[] str1 = str.split(" ");
	for(String str2 : str1)
	{
		String str3 = str2.toUpperCase();
		System.out.println(str3);
		if (str3.equalsIgnoreCase("job")) {
			System.out.println("JOB is exists!");
		}
	}*/
	
	/*String str = "java";
	
	String rev = "";
	
	for(int i = str.length()-1; i>=0; i--)
	{
		rev = rev + str.charAt(i);
	}
	//rev = "avaj"
	System.out.println("Reverse is: "+rev);*/
	
	/*StringBuffer sb = new StringBuffer(str);
	sb = sb.reverse();
	System.out.println(sb);*/
	
	
	
	
	
	
	
	
	
	
	
}
}
