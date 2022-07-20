package Array;
import java.util.Scanner;


public class UsingScanner {//class
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length: ");
		int arrLength=sc.nextInt();
		int anArray[]=new int[arrLength];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<arrLength;i++) {
			anArray[i]=sc.nextInt();
		}
		
		System.out.println("Display the array list");
		for(int i=0;i<arrLength;i++) {
			System.out.print(anArray[i]+" ");//show array list
		}
		sc.close();
	}

}
