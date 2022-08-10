package thread;

public class ThreadWithRunnableString implements Runnable {
	
	public void run() {
		System.out.println("Thread is running......");
	}
	public static void main(String args[]) {
		//this is a object of thread class where we using the constructor string name
		Runnable r=new ThreadWithRunnableString();//object of runnable interface
		Thread t=new Thread(r,"First thread");
		t.start();//move the thread to active state
		String s=t.getName();//we are getting thread name
		System.out.println(s);
		
	}


}
