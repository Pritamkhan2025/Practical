package Array;

public class Anonymous {
	static void print(int a[]) {//static max method as array as a arguments
	
		for(int i=1;i<a.length;i++)
		
		System.out.println(a[i]);
	}
	public static void main(String args[]) {
		print(new int[]{10,20,30,40,50,60,70});//Declaration & initialization
		
		}

}
