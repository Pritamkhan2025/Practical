package exceptionhand;

public class ThrowsEg {
	public static void mydisplay(int a) throws ArithmeticException{
		if(a>=0 && a<35) {
			//throw ArithmeticException if not eligible to vote
			throw new ArithmeticException("Student is fail");
		}
		else {
			System.out.println("You are pass");
		}
	}
	//main method7
	public static void main(String args[]) {
		//calling the function
		mydisplay(45);

	}


}
