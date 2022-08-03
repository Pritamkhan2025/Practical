package exceptionhand;
import java.util.Scanner;

 @SuppressWarnings("serial")
class Invalidageexception extends Exception {

	public Invalidageexception(String string) {
		// TODO Auto-generated constructor stub
	}

}
public class CustomException {
	
	public void checkage(int age) throws Invalidageexception {
		if(age<=18 || age>=25) {
			throw new Invalidageexception("Invalid age for enrolling java course");
		}
		else {
			System.out.println("proper age for enrolling java course");
		}
	}
	public static void main(String args[]) throws Invalidageexception {
		CustomException c=new CustomException();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		sc.close();
		c.checkage(age);	
		
	}

}
