package com;


/*
public class Overloadingtypepromotion {		//class
	void add(int a, long b) {		//method 1
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {		//method 2
		System.out.println(a+b+c);
	}
	public static void main(String args[]) {
		Overloadingtypepromotion obj = new Overloadingtypepromotion();
		obj.add(20, 30);		//2nd int wll be promoted as long
		obj.add(20, 30, 15);
	}

}
*/


public class Overloadingtypepromotion {		//class
	void add(int a, long b) {		//method 1
		System.out.println(a+b);
	}
	void add(long a,long b) {		//method 2
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		Overloadingtypepromotion obj = new Overloadingtypepromotion();
		obj.add(20, 30);		

	}

}

