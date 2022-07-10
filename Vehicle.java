package com;




public class Vehicle {	//parent class
void run() {
	System.out.println("running mode on");
}
}

	class Bike extends Vehicle{	//child class
		void features() {
			System.out.println("well executed features");
		}
	}
			class BMW extends Bike{
				void speed() {
					System.out.println("very high speed");
				}
			}
	
			class Testsingleinherit{
				public static void main(String[]args) {
					BMW d = new BMW();	//object of child
					d.run();		//parent class method
					d.features();	//child class method
					d.speed();
				}
			}
	
	


/*
public class Vehicle {	//parent class
	void run() {
		System.out.println("running mode on");
	}
}
	
		class Bike extends Vehicle{	//child class
			void features() {
				System.out.println("well executed features");
			}
		}
				class Activa extends Vehicle{
					void capasity() {
						System.out.println(" high capasity");
					}
				}
		
				class Testsingleinherit{
					public static void main(String[]args) {
						Activa d = new Activa();	//object of child
						d.run();		//parent class method
						//d.features();	//child class method
						d.capasity();
					}
				}
		
		


*/


/*

public class Vehicle{		//parent class
	void run() {
		System.out.println("running mode is on");
	}
}
	class Bike extends Vehicle{		//child class
		void run() {
			System.out.println("Bike running mode is on");
		}
		public static void main(String ags[]) {
			Bike d = new Bike();
			d.run();
		}
	}


*/
