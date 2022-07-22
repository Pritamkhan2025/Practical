package Wrapper;
//wrapper to primitive
public class Unboxing {
	public static void main(String args[]) {
		Integer a=new Integer(2);
		Integer i=a.intValue();//converting int into integer
		Integer j=a;//now compiler will write integer valueof (a) autoboxing
		System.out.println(a+" "+i+" "+j);
	}

}
