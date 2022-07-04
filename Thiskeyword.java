
public class Thiskeyword {
	int rollno;
	String name;
	float fee;
	static String college = "RERF";
	static void change() {
		college = "ITC";
	}
	Thiskeyword(int rollno, String name, float fee){
		this.rollno = rollno;
		this. name = name;
		this.fee =fee;
	}
	void display() {
		System.out.println(rollno+""+name+""+" "+fee);
	}
	public class Thiskeyword1{
		public static void main(String[]args) {
			Thiskeyword s1 = new Thiskeyword(115,"Pritam",50054);
			Thiskeyword s2 = new Thiskeyword(153,"JJJNJIJ",45000);
			s1.display();
			s2.display();
		}
	}

}
