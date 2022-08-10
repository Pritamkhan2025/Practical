package ioexception;

import java.io.FileInputStream;

public class FileInputStreamExample {//main class
	
	public static void main(String args[]) {//main method
		try {
			//instantiating FileInputStream object and passing adress of the fie
			FileInputStream obj=new FileInputStream("C:\\Users\\Pritha\\Desktop\\test.txt");
			int i=obj.read();
			System.out.print((char)i);
			//while loop
		    int j=0;
			while((j=obj.read())!=-1) {//condition for reading file
				System.out.print((char)j);//typecasting j to char type
			}
			
			obj.close();//closing the file
		}
		catch(Exception e){//handeling the exception
			System.out.println(e);
		}
	}

}
