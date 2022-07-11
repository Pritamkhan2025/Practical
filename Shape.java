package poly;



public class Shape {
	void draw() {
		System.out.println("drawing");
	}
}
	class Circle extends Shape{
		void draw() {
			System.out.println("Circular");
		}
	}
	class Square extends Shape{
		void draw() {
			System.out.println("Square have 4 sides");
		}	
	}
	class Triangle extends Shape{
		void draw() {
			System.out.println("Triangle have 3 sides");
		}	
	}
	
	class Runpolyshape{
		public static void main(String args[]) {
			Circle c=new Circle();
			Square s=new Square();
			Triangle t=new Triangle();
			c.draw();
			s.draw();
			t.draw();
			
			
		}

}
