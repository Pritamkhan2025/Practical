package thread;

public class SynchronizedDemo {
	
	//void printSynchronizedDemo(int num) {//nonsync method
	synchronized void printSynchronizedDemo(int num) {//sync method
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
		}
		
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Threadtest extends Thread{
	SynchronizedDemo t;
	Threadtest(SynchronizedDemo t) {
		this.t=t;
	}
	public void run() {
		t.printSynchronizedDemo(5);
	}

}
class Threadtest1 extends Thread{
	SynchronizedDemo t;
	Threadtest1(SynchronizedDemo t) {
		this.t=t;
	}
	public void run() {
		t.printSynchronizedDemo(100);
	}

}


