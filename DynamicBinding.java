package poly;



public class DynamicBinding {
	void run() {
		System.out.println("Method is not private");
	}

}
class test extends DynamicBinding{
	void run() {
		System.out.println("Method implementation is changed");
	}
	
	public static void main(String args[]) {
		test t= new test();
		t.run();
	}

}
