package exceptionhand;

public class ExceptionExample {
	public void show() {
		String a="i am error";
		System.out.println(a);
		try {
			int i=50/0;//Arithmetic exception
			System.out.println(i);
			String s="riya";
			System.out.println(s.length());
			int arr[]=new int[3];
			arr[4]=24;//array index out of bound
			int m=Integer.parseInt(s);//number format exception
			System.out.println(m);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		String b="i can not handle";
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		ExceptionExample ep=new ExceptionExample();
		ep.show();
		
	}

	
}
