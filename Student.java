package ioexception;

import java.io.Serializable;

//Serialization: writing state of an object into byte stream

@SuppressWarnings("serial")
public class Student implements Serializable{
	int id;
	String name;
	transient int fees;//use this data member of class in order to avoid serialization
	
	public Student(int id,String name,int fees) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	public static void main(String args[]) {
		
	}

}
