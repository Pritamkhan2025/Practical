//Method overloading : changing data type of argument

package com;


/*public class Addition {		//class
	static int add(int a,int b) {		//no of argument 2 add it
		return(a+b);
	}
	static int add(int a,int b,int c) {
		return(a+b+c);
	}
	class overloading{
		public static void main(String args[]) {
			System.out.println(Addition.add(10,10));
			System.out.println(Addition.add(10,10,10));
		}
	}

}
*/

public class Addition {		//class
	static int add(int a,int b) {			//no of argument 2 add it
		return(a+b);
	}
	static double add(double a,double b) {
		return(a+b);
	}
	class overloading{
		public static void main(String args[]) {
			System.out.println(Addition.add(10,10));
			System.out.println(Addition.add(100.42,10.55));
		}
	}

}