package Wrapper;

import java.util.ArrayList;

public class Unboxingeg {
	public static void main(String args[]) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		//autoboxing
		al.add(5);
		al.add(2);
		System.out.println("ArrayList: "+al);
		//unboxing
		int a=al.get(0);
		System.out.println("Value of index 0: "+a);
		
	}

}
