package Array;

import java.util.Scanner;

public class ArrayReverse {//class
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);//scanner class for get input from user
		System.out.print("Enter array length: ");
		int arrLength=sc.nextInt();
		int a[]=new int[arrLength];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<arrLength;i++) {//logic
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display the array list");
		for(int i=0;i<arrLength;i++) {
			System.out.print(a[i]+" ");//display original array
		}
		System.out.println();//new line
		
		System.out.println("Display the array list in reverse order");
		for(int i=arrLength-1;i>=0;i--) {
			System.out.print(a[i]+" ");//display array in reverse order
		}
		
		sc.close();
	}


}
