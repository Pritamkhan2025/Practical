package thread;

public class Deadlockdemo {
	public static void main(String args[]) {
		final String r1="Pritam";
		final String r2="Anudip Foundation";
		
		Thread t1=new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("Thread 1 : locked r1");
				
				try {
					Thread.sleep(100);
				}
				catch(Exception e) {	
				}
				synchronized (r1) {
					System.out.println("Thread 1 : locked r2");
				}
			}
		}
		
	};
	Thread t2=new Thread() {
		public void run() {
			synchronized (r2) {
				System.out.println("Thread 2 : locked r2");
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {	
			}
			synchronized (r2) {
				System.out.println("Thread 2 : locked r1");
			}
		}
	}
	
};
t1.start();
t2.start();
}
	

}
