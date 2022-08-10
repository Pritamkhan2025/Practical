package ioexception;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample {
	public static void main(String[] args) {
		try {
			ObjectInputStream obj2=new ObjectInputStream(new FileInputStream("C:\\Users\\Pritha\\Desktop\\sample2.txt"));
			Student s=(Student)obj2.readObject();
			System.out.println("Id is: "+s.id+",Name is: "+s.name+",Fees is: "+s.fees);
			obj2.close();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
