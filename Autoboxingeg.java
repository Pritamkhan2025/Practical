package Wrapper;

import java.util.ArrayList;

public class Autoboxingeg {
	public static void main(String args[]) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		//creating an empty array list of integer type
		al.add(1);//adding int primitive type value
		al.add(2);
		al.add(3);//auto boxing
		System.out.println("ArrayList: "+al);
		
	}

}
