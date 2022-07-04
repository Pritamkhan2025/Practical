
public class Staticvariable {
	int rollno;
	String name;
	static String college = "RERF";
	Staticvariable(int r, String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno+""+name+""+college);
	}
	public class Staticvariable1{
		public static void main(String[]args) {
			Staticvariable s1 = new Staticvariable(11,"Pritam");
			Staticvariable s2 = new Staticvariable(12,"AAAAA");
			s1.display();
			s2.display();
		}
	}

}
