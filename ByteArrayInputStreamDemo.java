package ioexception;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
	public static void main(String args[]) {
		byte [] arr= {65,37,70,39,81};
		ByteArrayInputStream obj=new ByteArrayInputStream(arr);
		
		int i=0;
		while((i=obj.read())!=-1) {
			char ch=((char)i);
			System.out.println("ASCII Character"+i+"Value is"+ch);
		}
	}

}
