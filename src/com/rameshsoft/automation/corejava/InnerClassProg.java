package com.rameshsoft.automation.corejava;

class OuterOne
{
	public void hardwork() {
		System.out.println("OC: Hardwork");
	}
	static public void job() {
		System.out.println("OC: Job");
	}
	class InnerOne
	{
		public void hardwork() {
			System.out.println("NSIC: Hardwork");
		}
	}
	static class InnerTwo
	{
		public void hardwork() {
			System.out.println("SIC: Hardwork");
		}
		static public void job() {
			System.out.println("SIC: Job");
		}
	}
}
public class InnerClassProg {
public static void main(String[] args) {
	
	OuterOne outerOne = new OuterOne();
	
	//OuterOne.InnerTwo two = outerOne.new InnerTwo();
	
	//two.hardwork();
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*OuterOne.InnerTwo.job();
	OuterOne.InnerTwo two = new OuterOne.InnerTwo();
	two.hardwork();
	two.job();*/
	
	/*OuterOne outer = new OuterOne();
	outer.hardwork();
	outer.job();
	OuterOne.job();*/
}
}
