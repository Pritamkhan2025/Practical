package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEg {

	public static void main(String[] args) {
		//creating array list
		List <String> al=new ArrayList <String>();
		//adding object to array list
		al.add("pritam");
		al.add("arnab");
		al.add("sayan");
		al.add("akash");
		al.add("sankhajit");
		al.add("saikat");
		al.add("uday");
		//printing array list object
		System.out.println("size of array list: "+al.size());//printing array list
		al.remove(5);//removing element at index 5
		System.out.println(al);//printing array list after removing
		System.out.println("size of array list: "+al.size());
		al.add("ravi");
		al.add("viswa");
		System.out.println(al);
		System.out.println("size of array list: "+al.size());
		System.out.println("elemant of the index value is: "+al.get(6));
		System.out.println();
		
		System.out.println("traversing using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		
		for(String s :al) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("traversing using Iterator");
		Iterator <String> itr=al.iterator();//getting the iterator
		while(itr.hasNext()) {//checking iterator has element
			System.out.println(itr.next());//printing element and move to next
		}
		System.out.println();
		
		System.out.println("traversing using list Iterator-forward");
		ListIterator<String> itr1=al.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		
		System.out.println("traversing using list Iterator-backward");
		ListIterator <String> itr2=al.listIterator();
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}

	}

}
