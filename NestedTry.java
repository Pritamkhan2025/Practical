package exceptionhand;

public class NestedTry {
	public static void main(String args[]) {
		try {//outer try block
			try {//inner try block 1
				System.out.println("going to divide by zero");
				@SuppressWarnings("unused")
				int b=19/0;
			}
			catch(Exception e) {//catch block of inner try block
				System.out.println(e);
			}
			try {//inner try block 2
				int a[]=new int[5];
				a[6]=4;//assigning the value out of array bounds
			}
			catch(ArrayIndexOutOfBoundsException e) {//catch block of inner try block 2
				System.out.println(e);
			}
			System.out.println("other statement");
			
		}
		catch(Exception e) {//catch block of outer try block
			System.out.println("handled the exception (outer catch)");
		}
		
	}

}
