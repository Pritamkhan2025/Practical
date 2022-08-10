package ioexception;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("C:\\Users\\Pritha\\Desktop\\sample1.txt");
			obj.write("Welcome ");
			FileReader obj1=new FileReader("C:\\Users\\Pritha\\Desktop\\sample1.txt");
			int i=0;
			while((i=obj1.read())!=-1) {
				System.out.println((char)i);
			}
			obj.close();
			obj1.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
