package inheri;

public class Student_Encapsulate {
	private String name="Pritam";		//private data member
	public String getName() {		//getter method for name
		return name;
	}
	public void setName(String name) {		//setter method for name
		this.name=name;
  }

}
 class Test_encapsulate {
	public static void main(String ags[]) {
		Student_Encapsulate s=new Student_Encapsulate();
		s.setName("Pritam");			//setting the value
		System.out.println(s.getName());		//getting the value
		
	}

}
