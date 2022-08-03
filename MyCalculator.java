package exceptionhand;

public class MyCalculator {//class
	
	public static long power(int n,int p) throws Exception{
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative");
		}	
		else if(n==0 && p==0) {
			throw new Exception("n or p should not be zero");
		}	
		else {
			return (long)Math.pow(n, p);
		}
			
	}
	//main method
	public static void main(String args[]) throws Exception{
		System.out.println(power(2,3));
	}
	

}

