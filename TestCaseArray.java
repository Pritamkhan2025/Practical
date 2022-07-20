package Array;


/*
public class TestCaseArray {
	public static void main(String args[]) {
		int a[]= new int[7];//Declaration & initialization
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
	
		for(int i=0;i<a.length;i++) {	//loop(traversing array) length is property of array
			System.out.println(a[i]);
		}
	}

}




/*
public class TestCaseArray {
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50,60,70};//Declaration & initialization
		//a[0]=10;
		//a[1]=20;
		//a[2]=30;
		//a[3]=40;
		//a[4]=50;
		//a[5]=60;
		//a[6]=70;
	
		for(int i=0;i<a.length;i++) {	//loop(traversing array) length is property of array
			System.out.println(a[i]);
		}
	}

}

/*






public class TestCaseArray {
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50,60,70};//Declaration & initialization
	
		for(int i:a) {	//loop(traversing array) length is property of array
			System.out.println(a[i]);
		}
	}

}

*/





public class TestCaseArray {
	static void max(int a[]) {//static max method as array as a arguments
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(max<a[i])
				max=a[i];
		System.out.println(max);
	}
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50,60,70};//Declaration & initialization
		max(a);

		}
	}

















