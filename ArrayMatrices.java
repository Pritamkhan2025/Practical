package Array2d;

public class ArrayMatrices {//class
	public static void main(String args[]) {
		//creating matrices
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{2,3,4},{5,6,4}};
		int c[][]=new int[2][3];//store the value
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");//show value
			}
			System.out.println();//new line
		}
	}

}
