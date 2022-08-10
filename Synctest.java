package thread;

public class Synctest {

	public static void main(String[] args) {
		SynchronizedDemo s=new SynchronizedDemo();
		Threadtest t1=new Threadtest(s);
		Threadtest1 t2=new Threadtest1(s);
		
		t1.start();
		t2.start();

	}

}
