
public class Staticmethod {
		int rollno;
		String name;
		static String college = "RERF";
		static void change() {
			college = "ITC";
		}
		Staticmethod(int r, String n){
			rollno = r;
			name = n;
		}
		void display() {
			System.out.println(rollno+""+name+""+college);
		}
		public class Staticmethod1{
			public static void main(String[]args) {
				Staticmethod s1 = new Staticmethod(115,"Pritam");
				Staticmethod s2 = new Staticmethod(153,"JJJNJIJ");
				s1.display();
				s2.display();
			}
		}

	}

