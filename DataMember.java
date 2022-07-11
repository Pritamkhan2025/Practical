package poly;



public class DataMember {
	int CarSpeed = 80;

	}
	class CarName extends DataMember{
		int CarSpeed = 90;
		public static void main(String args[]) {
			CarName c=new CarName();
			System.out.println(c.CarSpeed);
		}

}
