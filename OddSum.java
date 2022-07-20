package Array;

import java.util.Scanner;

public class OddSum {//class
	public static void main(String args[]) {
		int sum=0;
		Scanner sc=new Scanner(System.in);//get input from user
		System.out.print("Enter array length: ");
		int arrLength=sc.nextInt();
		int a[]=new int[arrLength];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<arrLength;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.print("Display odd number: ");
		for(int i=0;i<arrLength;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");//display odd numbers
				sum=sum+a[i];//store sum of odd numbers
			}
			
		}
		System.out.println();//new line
		System.out.println("Sum of odd numbers is: "+sum);//display sum
		
		sc.close();
	}

}
