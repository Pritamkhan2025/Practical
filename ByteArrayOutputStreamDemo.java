package ioexception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo{ 
	public static void main(String args[]) throws IOException{
		
			FileOutputStream obj1=new FileOutputStream("C:\\Users\\Pritha\\Desktop\\sample1.txt");
			FileOutputStream obj2=new FileOutputStream("C:\\Users\\Pritha\\Desktop\\sample2.txt");
			
			ByteArrayOutputStream obj=new ByteArrayOutputStream();
			obj.write(65);
			obj.writeTo(obj1);
			obj.writeTo(obj2);
			obj.close();
			System.out.println("done");
	}

	

}
