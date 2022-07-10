package Pro.src;

public class Paracons {
	String name;
	Paracons(String name){
		name  = "anudip";
		System.out.println("cons called");
	}
	
	public static void main(String[]args) {
		Paracons obj = new Paracons("java");
		Paracons obj1 = new Paracons("c++");
		Paracons obj2 = new Paracons("c");
		System.out.println("The name is " + obj.name);
		System.out.println("The name is " + obj1.name);
		System.out.println("The name is " + obj2.name);
	}

}
