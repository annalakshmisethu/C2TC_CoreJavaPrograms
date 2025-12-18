package com.tnsif.basics;

public class NestedLoop {

	public static void main(String[] args) {
		int beg = 2;
		int end = 4;
		for(int i = beg; i<=end;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
