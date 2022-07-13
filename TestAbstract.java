package inheri;

abstract class TestAbstract {
	TestAbstract() {
		System.out.println("Abstract class is created");
	}
	abstract void run();
	void changeSpeed() {
		System.out.println("Speed changed");
	}

}
class child extends TestAbstract{
	void run() {
		System.out.println("Running safely");
	}
}
class TestAbstraction{
	public static void main(String args[]) {
		TestAbstract t=new child();
		t.run();
		t.changeSpeed();
	}
}
