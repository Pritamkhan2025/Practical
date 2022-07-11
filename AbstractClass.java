package poly;

abstract class AbstractClass {
	abstract void run();
}
	class child extends AbstractClass{
		void run() {
			System.out.println("running mode on");	
			}
		public static void main(String args[]) {
			child c=new child();
			c.run();

			
		}
	}


