package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEg {

	
	public static void main(String[] args) {
		
		//creating HashSet and adding element
		Set<String>s=new LinkedHashSet<String>();
		s.add("pen");
		s.add("pencil");
		s.add("mouse");
		s.add("phone");
		s.add(null);
		s.add("door");
		s.add("ac");
		s.add("bull");
		s.add("car");
		Iterator<String>i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}


	}

}
