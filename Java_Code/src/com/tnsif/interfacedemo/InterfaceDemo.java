package com.tnsif.interfacedemo;
interface basic{
	void demo();
	
}

public class InterfaceDemo implements basic{
	public void demo() {
		System.out.println("HELLO WORLD");
	}
	public static void main(String[] args) {
		InterfaceDemo id =new InterfaceDemo();
	  id.demo();
		
	}
}

	