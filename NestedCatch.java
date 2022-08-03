package exceptionhand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch {
	public static void main(String args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number: ");
		sc.close();
		
		try {
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(" "+(x/y));
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
