package com.rameshsoft.automation.corejava;

interface Inter1
{
	void hardwork();
	void job();
	interface Inter2
	{
		void hardwork();
		void practice();
	}
}
class Inter1Impl implements Inter1
{
	@Override
	public void hardwork() {
		System.out.println("Hardwork");
	}
	@Override
	public void job() {
		System.out.println("Job");
	}
}
class Inter2Impl implements Inter1.Inter2
{
	@Override
	public void hardwork() {
		System.out.println("Hardwork");
	}
	@Override
	public void practice() {
		System.out.println("Practice");
	}
}
class Inter1Inter2Impl implements Inter1,Inter1.Inter2
{
	@Override
	public void hardwork() {
		System.out.println("Hardwork");
	}
	@Override
	public void job() {
		System.out.println("Job");
	}
	@Override
	public void practice() {
		System.out.println("Practice");
	}
}
public class InnerInterfaceTest {
public static void main(String[] args) {
	
	
	
}
}
