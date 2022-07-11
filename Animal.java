package poly;



public class Animal {
	void hunt() {
		System.out.println("hunting for food");
	}
}
	class Lion extends Animal{
		void hunt() {
			System.out.println("hunting deer");
		}
	}
	class Tiger extends Animal{
		void hunt() {
			System.out.println("hunting buffalo");
		}	
	}
	class Snake extends Shape{
		void hunt() {
			System.out.println("hunting frog");
		}	
	}
	
	class Runpolyanimal{
		public static void main(String args[]) {
			Lion l=new Lion();
			Tiger t=new Tiger();
			Snake s=new Snake();
			l.hunt();
			t.hunt();
			s.hunt();
			
			
		}


}
