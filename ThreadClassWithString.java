package thread;

public class ThreadClassWithString {

	public static void main(String[] args) {
		Thread obj=new Thread("first thread");
		obj.start(); //move the thread to the active state
		String s=obj.getName();
		System.out.println(s);

	}

}
