package Array;

import java.util.Scanner;

public class EvenArray {//class
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);//scanner class for get user input
		
		System.out.print("Enter array length: ");
		int arrLength=sc.nextInt();
		int a[]=new int[arrLength];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<arrLength;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Display Even number:");
		for(int i=0;i<arrLength;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
			sc.close();
		}
		
	}


}
