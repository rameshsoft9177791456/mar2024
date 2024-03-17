package com.rameshsoft.automation.corejava;

abstract class AbstractProg1
{
	public void hardwork() {
		System.out.println("Hardwork");
	}
	abstract public void job();
	public abstract void sal();
}
abstract class AbstractProg1Child extends AbstractProg1
{
	@Override
	public void job() {
		System.out.println("JOB");
	}
	public void practice() {
		System.out.println("PRACTICE = JOB");
	}
	public void subject() {
		System.out.println("SUBJECT");
	}
}
class AbstractProg1Child1 extends AbstractProg1Child
{
	@Override
	public void sal() {
		System.out.println("SAL");
	}
}
public class AbstractProg {
public static void main(String[] args) {
	//AbstractProg1 prog = new AbstractProg1();
	//AbstractProg1Child child = new AbstractProg1Child();
	/*AbstractProg1Child1 child = new AbstractProg1Child1();
	child.hardwork();
	child.job();
	child.practice();
	child.sal();
	child.subject();*/
	
	AbstractProg1Child child = new AbstractProg1Child1();
	child.hardwork();
	child.job();
	child.practice();
	child.sal();
	child.subject();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}