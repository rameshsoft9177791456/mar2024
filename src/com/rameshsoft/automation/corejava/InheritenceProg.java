package com.rameshsoft.automation.corejava;

class Fp_Men
{
	public void login() {
		System.out.println("login()");
		//;;;;;;;;;;;;;;;;;;;;;25 lines of code
	}
	public void clothes() {
		System.out.println("clothes()");
	}
	public void logout() {
		System.out.println("logout()");
		//;;;;;;;;;;;;;;;;;;;;;15 lines of code
	}
}
class Fp_Women extends Fp_Men
{
	public void jewellery() {
		System.out.println("jewellery()");
	}
	public void gold() {
		System.out.println("gold()");
	}
}
class Fp_Kids extends Fp_Women
{
	public void toys() {
		System.out.println("toys()");
	}
}
public class InheritenceProg {
public static void main(String[] args) {
	
	//1. creating parent class object
	Fp_Men men = new Fp_Men();
	men.login();
	men.clothes();
	men.logout();
	
	//2. creating child class object
	/*Fp_Women women = new Fp_Women();
	women.login();
	women.clothes();
	women.gold();
	women.jewellery();
	women.logout();
	
	//2. creating child class object
	Fp_Kids kids = new Fp_Kids();
	kids.login();
	kids.clothes();
	kids.gold();
	kids.jewellery();
	kids.logout();
	kids.toys();*/
	
	//3. creating child class object by using parent class reference
	/*Fp_Men men = new Fp_Women();
	men.login();
	men.clothes();
	men.logout();*/
	
	
	//4. creating parent class object using child class reference
	//Fp_Women women = new Fp_Men();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
