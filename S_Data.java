package inheri;
import java.util.Scanner;

public class S_Data {
	private String name;
	private long id;
	private long password;
	private float sub1;
	private float sub2;
	private float sub3;
	private float sub4;
	private float sub5;
	private float percentage;
	
	public String getName() {		
		return name;
	}
	public void setName(String name) {		
		this.name=name;
  }
	public long getId() {		
		return id;
	}
	public void setId(long id) {		
		this.id=id;
  }
	public long getPassword() {		
		return password;
	}
	public void setPassword(long password) {		
		this.password=password;
  }
	public float getSub1() {		
		return sub1;
	}
	public void setSub1(float sub1) {		
		this.sub1=sub1;
  }
	public float getSub2() {		
		return sub2;
	}
	public void setSub2(float sub2) {		
		this.sub2=sub2;
  }
	public float getSub3() {		
		return sub3;
	}
	public void setSub3(float sub3) {		
		this.sub3=sub3;
  }
	public float getSub4() {		
		return sub4;
	}
	public void setSub4(float sub4) {		
		this.sub4=sub4;
  }
	public float getSub5() {		
		return sub5;
	}
	public void setSub5(float sub5) {		
		this.sub5=sub5;
  }

	public float getPercentage() {		
		return percentage;
	}
	public void setPercentage(float percentage) {		
		this.percentage=percentage;
  }
	
	 void calculate(float sub1,float sub2,float sub3,float sub4,float sub5) {
		float total=sub1+sub2+sub3+sub4+sub5;
		percentage=total/5;
		
	}
	

		
}
class Test_S_Data {
	public static void main(String ags[]) {
		
		String name;
		long id;
		long password;
		float sub1;
		float sub2;
		float sub3;
		float sub4;
		float sub5;
		
	
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your name:- ");
		name=sc.nextLine();
		
		System.out.println("Enter your id:- ");
		id=sc.nextLong();
		
		System.out.println("Enter your password:-");
		password=sc.nextLong();
		
		System.out.println("Enter the number of 5 subjects");
		System.out.println("Enter number of sub1:-");
		sub1=sc.nextFloat();
		
		System.out.println("Enter number of sub2:-");
		sub2=sc.nextFloat();
		
		System.out.println("Enter number of sub3:-");
		sub3=sc.nextFloat();
		
		System.out.println("Enter number of sub4:-");
		sub4=sc.nextFloat();
		
		System.out.println("Enter number of sub5:-");
		sub5=sc.nextFloat();
		sc.close();
		
		S_Data s=new S_Data();
		s.setName(name);
		s.setPassword(password);
		s.setId(id);
		
		System.out.println("Name : "+s.getName());
		System.out.println("User ID: "+s.getId());
		System.out.println("User Password : "+s.getPassword());
		
		s.calculate(sub1,sub2,sub3,sub4,sub5);
		
		System.out.println("Percentage: "+s.getPercentage());


		

			
		}
		

	}



