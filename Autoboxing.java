package Wrapper;

public class Autoboxing {
	public static void main(String args[]) {
		int a=10;
		Integer i=Integer.valueOf(a);//converting int into integer
		Integer j=a;//now compiler will write integer valueof (a) autoboxing
		System.out.println(a+" "+i+" "+j);
	}

}
