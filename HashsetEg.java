package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Pen");
		s.add("Pen");
		s.add("Pen");
		s.add("Pen");
		s.add("Pen");
		s.add("Pen");
		s.add("Pen");
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
