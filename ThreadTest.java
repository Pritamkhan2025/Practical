package thread;

//thread eg by implementing runnable interface
//public class ThreadTest implements Runnable{
	//thread eg by extending thread class
public class ThreadTest extends Thread{
	public void run() {
		System.out.println("i am thraed");
	}
	public static void main(String args[]) {
		ThreadTest t1=new ThreadTest();
		t1.start();
	}
	
}
