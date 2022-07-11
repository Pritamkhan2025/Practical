package poly;

public class StaticBinding {
	private void run() {
		System.out.println("Method is private");
	}
	public static void main(String args[]) {
		StaticBinding s=new StaticBinding();
		s.run();
	}

}
