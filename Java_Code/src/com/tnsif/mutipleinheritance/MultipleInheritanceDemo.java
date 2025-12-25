package com.tnsif.mutipleinheritance;
interface Printable {
    void print();
}
interface Scanable {
	void scan();
}
class Document implements Printable,Scanable{
	@Override
	public void print() {
		System.out.println("document is to print");
	}
	@Override
	public void scan() {
		System.out.println("document is to scan");
		}
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Document obj = new Document();
		obj.print();
		obj.scan();
		// TODO Auto-generated method stub

	}

}
