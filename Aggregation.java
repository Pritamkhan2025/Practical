package Pro.src;

public class Aggregation {	//class 1
	int Square(int n) {
		return n*n;
	}

}
class circle{		//class 2
	Aggregation ag;		//obj(entity ref)line 1
	double pi= 3.14;
	double area(int radius) {
		ag = new Aggregation();		//line 2
		int psquare = ag.Square(radius);
		return pi*psquare;
	}
	public static void main(String[]args) {	//main method
		circle c = new circle();
		double result = c.area(5);		//pi*radius*radius=3.14*5*5
		System.out.println(result);
	}
}
