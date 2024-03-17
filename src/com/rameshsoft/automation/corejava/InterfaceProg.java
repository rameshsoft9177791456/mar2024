package com.rameshsoft.automation.corejava;

@FunctionalInterface
interface Job
{
	void job();
	public static void createAccount()
	{
		System.out.println("ISM: Account is created");
	}
}

interface BankAtm
{
	String bankName = "RAMESHSOFT BANK"; //public static final
	void balEnq(); //public abstract
	void pinChange(); //public abstract
	double cashWithDraw(); //public abstract
	public abstract void cashDeposit();
	private void hardwork1() {
		System.out.println("private: ISNM");
	}
	private static void hardwork2() {
		System.out.println("private: ISM");
	}
	public static void createAccount()
	{
		System.out.println("ISM: Account is created");
	}
	default void loan()
	{
		hardwork1();
		hardwork2();
		System.out.println("Default method: INSM: loan");
	}
	
	
}
abstract class BankAtmImpl implements BankAtm
{
	@Override
	public void balEnq() {
		System.out.println("BAL ENQ");
	}
	@Override
	public double cashWithDraw() {
		System.out.println("CASHWITHDRAW");
		return 250000;
	}
	@Override
	public void cashDeposit() {
		System.out.println("CASHDEPOSIT");
	}
	public void bankLoans() {
		System.out.println("BANK LOANS");
	}
}
class BankAtmImpl1 extends BankAtmImpl
{
	@Override
	public void pinChange() {
		System.out.println("PIN CHANGE");
	}
	public void offers() {
		System.out.println("OFFERS");
	}
	@Override
	public void loan()
	{
		System.out.println("Overiding: loan");
	}
}
public class InterfaceProg {
public static void main(String[] args) {
	
	BankAtm.createAccount();
	
	BankAtmImpl1 atm = new BankAtmImpl1();
	atm.loan();
	
	//BankAtm atm = new BankAtm();
	//BankAtmImpl atm = new BankAtmImpl();
	/*BankAtmImpl1 atm = new BankAtmImpl1();
	atm.balEnq();
	atm.bankLoans();
	atm.cashDeposit();
	atm.cashWithDraw();
	atm.pinChange();
	String bName = atm.bankName;
	System.out.println("Bank name is: "+bName);
	
	String bName1 = BankAtm.bankName;
	System.out.println("Bank name is: "+bName1);*/
	
	/*BankAtm atm = new BankAtmImpl1();
	atm.balEnq();
	atm.cashDeposit();
	atm.cashWithDraw();
	atm.pinChange();
	String bName = atm.bankName;
	System.out.println("Bank name is: "+bName);
	
	String bName1 = BankAtm.bankName;
	System.out.println("Bank name is: "+bName1);*/
	
	
	
}
}
