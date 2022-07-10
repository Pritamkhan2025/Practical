package Pro.src;
/*
 * @author pritam khan
 */
public class Inhertanceisa {	//parent /base class
	float salary = 400000;

}
class Inherit extends Inhertanceisa{	//child/derived/extend
	int bonus = 10000;
	public static void main(String[]args) {
		Inherit i = new Inherit();				//obj of child
		System.out.println("Salary is "+i.salary);
		System.out.println("Bonus is "+i.bonus);
	}
}
