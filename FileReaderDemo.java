package ioexception;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			
			FileReader obj1=new FileReader("C:\\Users\\Pritha\\Desktop\\sample1.txt");
			int i=0;
			while((i=obj1.read())!=-1) {
				System.out.print((char)i);
			}
			
			obj1.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
