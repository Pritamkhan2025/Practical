package String;

import java.util.Scanner;

public class StringEquality {
	public static void main(String args[]) {
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		str1=sc.nextLine();
		
		System.out.println("Enter second string: ");
		str2=sc.nextLine();
		sc.close();
		
		if(str1.equals(str2))
			System.out.println("Equal string ");
		else
			System.out.println("UnEqual string ");
	}

}
