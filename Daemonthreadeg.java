package thread;

public class Daemonthreadeg extends Thread{
	
	public void run() {
		
		//System.out.println("name :"+Thread.currentThread().getName());
		//System.out.println("Daemon :"+Thread.currentThread().isDaemon());
		
		if(Thread.currentThread().isDaemon()) {//checking for demon thread
			System.out.println("i am daemon thread");
		}
		else {
			System.out.println("i am user thread");
		}
	}
	public static void main(String ...args) {
		Daemonthreadeg t1=new Daemonthreadeg();
		Daemonthreadeg t2=new Daemonthreadeg();
		t1.setDaemon(true);//will throw exception
		t1.start();
		
		t2.start();

		
	}

}
