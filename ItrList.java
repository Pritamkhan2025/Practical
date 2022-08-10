package collection;
/*
 * @pritam khan
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ItrList {

	public static void main(String[] args) {
		
		//no-1
		List <String> al=new ArrayList <String>();
		//adding object to array list
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		//printing array list object
		System.out.println(al);//printing array list
		
		Iterator <String> itr=al.iterator();//getting the iterator
		while(itr.hasNext()) {//checking iterator has element
			System.out.println(itr.next());//printing element and move to next
		}
		System.out.println();
		
		//no-2
		
		List <String> all=new ArrayList <String>();
		//adding object to array list
		all.add("Red");
		all.add("Green");
		all.add("Orange");
		all.add("White");
		all.add("Black");
		//printing array list object
		System.out.println(all);
		
		all.add(0,"pink");//add object at 0 index position
		System.out.println(all);

	}

}
