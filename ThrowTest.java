package exceptionhand;

public class ThrowTest {
	//defining method
	public static void checknum(int num) {
		if(num<0) {
			throw new ArithmeticException("Number negetive");
		}
		else {
			System.out.println("Executed perfectly");
		}
	}
	public static void main(String args[]) {
		checknum(6);
		System.out.println("Executed");
	}

}
