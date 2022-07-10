package com;



public class Student {
	int id;
	String name;
	Address address;
	public Student(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String args[]) {
		Address address1 =new Address("amt","wb","india");
		Address address2 =new Address("kol","wb","india");
		Student s= new Student(12,"pritam",address1);
		Student s1= new Student(123,"anudip",address2);
		s.display();
		s1.display();
	}

}