package com.tnsif.oops.inheritance;
class A{
	void display() {
		System.out.println("Hello World");
	}
}
class B extends A{
}
class C extends A{
	
}

public class InheritanceDemo {
	

	public static void main(String[] args) {
		B obj = new B();
		obj.display();
		// TODO Auto-generated method stub

	}

}
