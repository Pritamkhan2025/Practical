package String;
import java.util.Scanner;

public class StringTest {
	public void show() {//method
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");//line no 1
		String A=s.next();//1st string 
		String B=s.next();//2nd string
		s.close();
		
		System.out.println(A.length()+B.length());//1st string length +(concat)2nd string
		System.out.println((A.compareTo(B)>0) ? "Yes" : "No");//compare to()
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(3)+
				" "+B.substring(0,1).toUpperCase()+B.substring(1));
		
	}
	public static void main(String ...args) {
		StringTest t=new StringTest();
		t.show();
		
	}

}
