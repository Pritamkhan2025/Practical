package String;

public class Mutuableeg {
	public static void my() {
		StringBuffer s=new StringBuffer("Hello");
		s.append("World");
		System.out.println("String is: "+s);
		s.insert(2, "Pritam");
		System.out.println("Insert is: "+s);
		s.replace(1, 3, "Java");
		System.out.println("String is: "+s);
		
		StringBuffer s1=new StringBuffer("World");
		s1.replace(1,3,"Java");
		System.out.println("String is: "+s);
		s1.delete(1,3);
		System.out.println("Delete is: "+s);
		s1.reverse();
		System.out.println("Reverse is: "+s);
	}
	public static void main(String args[]) {
		my();
	}

}
