package com.rameshsoft.automation.corejava;

class BlocksTest
{
	public BlocksTest()
	{
		System.out.println("PC: DC");
	}
	static
	{
		System.out.println("PC: SB1");
	}
	static
	{
		System.out.println("PC: SB2");
	}
	{
		System.out.println("PC: IB");
	}
}

public class BlocksProg extends BlocksTest{
	public BlocksProg()
	{
		System.out.println("CC: DC");
	}
	static
	{
		System.out.println("CC: SB1");
	}
	{
		System.out.println("CC: IB");
	}
	static
	{
		System.out.println("CC: SB2");
	}
public static void main(String[] args) {
	System.out.println("MAIN() method");
	BlocksProg prog = new BlocksProg();
}
}

