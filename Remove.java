package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		//creating array list
		List <String> al=new ArrayList <String>();
		//adding object to array list
		al.add("red");
		al.add("white");
		al.add("blue");
		al.add("green");
		//printing array list object
		System.out.println(al);//printing array list
		//al.remove(2);//removing element at 3
		//System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		

}
}
