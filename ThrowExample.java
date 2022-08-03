package exceptionhand;

public class ThrowExample {
	//function to check if person is eligible for vote or not
	public static void Eligible(int age){
		if(age<18) {
			//throw ArithmeticException if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else {
			System.out.println("Persion is eligible to vote");
		}
	}
	//main method7
	public static void main(String args[]) {
		//calling the function
		Eligible(20);

	}

}
