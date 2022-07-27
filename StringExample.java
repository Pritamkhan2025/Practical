package String;

public class StringExample {
	public void show() {
		char[]arr= {'j','a','v','a'};
		String s=new String(arr);
		System.out.println("The value is: "+s);
		System.out.println(arr);
	}
	public void myfunction() {
		String n="pritam";
		String n1="pritam";
		String n2=new String("pritam");

}
	public static void main(String args[]) {
		StringExample s=new StringExample();
		s.show();
		s.myfunction();
	}
}