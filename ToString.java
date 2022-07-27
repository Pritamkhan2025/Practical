package String;

public class ToString {
	int rollno;//integer type var
	String name,addr;//string
	ToString(int rollno,String name,String addr){
		this.rollno=rollno;
		this.name=name;
		this.addr=addr;
	}
	public String toString() {//return obj to string
		return super.toString();//obj to string
	}
	public static void main(String args[]) {
		ToString s1=new ToString(1,"Ram","Mumbai");
		ToString s2=new ToString(2,"Karan","Delhi");
		System.out.println(s1);
		System.out.println(s2);
	}

}
