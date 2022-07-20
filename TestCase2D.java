package Array2d;

public class TestCase2D {//class
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{2,4,5},{5,6,7}};//declaring and initializing
		for(int i=0;i<3;i++) {		//logic for print array
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();//new line
		}
	}

}
