package ioexception;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	
	public static void main(String args[]) {
		try {
			FileOutputStream obj=new FileOutputStream("C:\\Users\\Pritha\\Desktop\\test.txt");
			obj.write(15658842);
			String s="any line";
			byte b[]=s.getBytes();
			
			obj.write(b);
			obj.close();
			System.out.println("done");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
