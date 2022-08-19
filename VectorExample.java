package collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vc=new Vector<String>();
		//adding elements
		vc.add("Dog");
		vc.add("Cat");
		vc.add(0,"Tiger");
		vc.add("Lion");
		System.out.println("Elements are: ");
		System.out.println(vc);
		
		//checking size & capacity
		System.out.println("Size: "+vc.size());
		System.out.println("Capacity: "+vc.capacity());
		//add more elements
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("After adding element: ");
		System.out.println(vc);
		
		//checking cat is present or not in vector
		if(vc.contains("Cat")) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}
		
		//getting 1st element
		System.out.println("1st element:"+vc.firstElement());
		//getting last element
		System.out.println("Last element:"+vc.lastElement());
		//checking index of specified element
		System.out.println("Index position:"+vc.indexOf("Cat"));

	}

}
