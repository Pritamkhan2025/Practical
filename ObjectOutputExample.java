package ioexception;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		try {
			Student s=new Student(101,"pritam",5000);
			FileOutputStream obj=new FileOutputStream("C:\\Users\\Pritha\\Desktop\\sample2.txt");
			
			ObjectOutputStream obj2=new ObjectOutputStream(obj);
			obj2.writeObject(s);
			obj2.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
