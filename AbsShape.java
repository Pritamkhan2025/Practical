package com;



abstract class AbsShape {
	abstract void draw();
	}
		class Circle extends AbsShape{
			void draw() {
				System.out.println("Circular");
			}
		}
		class Square extends AbsShape{
			void draw() {
				System.out.println("Square have 4 sides");
			}	
		}
		class Triangle extends AbsShape{
			void draw() {
				System.out.println("Triangle have 3 sides");
			}	
		}
		
		class Runabs{
			public static void main(String args[]) {
				Circle c=new Circle();
				Square s=new Square();
				Triangle t=new Triangle();
				c.draw();
				s.draw();
				t.draw();
				
				
			}


}
