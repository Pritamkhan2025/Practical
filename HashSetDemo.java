package collection;

import java.util.*;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String>set=new HashSet<String>();
		set.add("Ram");
		set.add("Rima");
		set.add("Raman");
		set.add("Raj");
		set.add("Ram");
		System.out.println("original list: "+set);
		//remove specific element from hashset
		set.remove("Ram");
		System.out.println("After invoking remove: "+set);
		
		HashSet<String>set1=new HashSet<String>();
		set1.add("Pritam");
		set1.add("Khan");
		System.out.println("updated list: "+set);
		//remove all the new elements
		set.removeAll(set1);
		//remove all
		set.clear();
		System.out.println("present list: "+set);
		

	}

}
