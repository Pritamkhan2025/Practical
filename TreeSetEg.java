package collection;

//import java.util.Iterator;
import java.util.TreeSet;

/*
public class TreeSetEg {

	public static void main(String[] args) {
		//creating HashSet and adding element
				TreeSet<String>s=new TreeSet<String>();
				s.add("one");
				s.add("two");
				s.add("three");
				s.add("four");
				s.add("five");
				System.out.println("Original list: "+s);
				
				//traversing elements through descending order
				Iterator<String>itr=s.descendingIterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}

	}

}
*/



/*

public class TreeSetEg {

	public static void main(String[] args) {
		//creating HashSet and adding element
				TreeSet<String>s=new TreeSet<String>();
				s.add("24");
				s.add("12");
				s.add("72");
				s.add("56");
				System.out.println("Lowest value: "+s.pollFirst());
				System.out.println("Highest value: "+s.pollLast());
			

	}

}

*/

/*


public class TreeSetEg {

	public static void main(String[] args) {
		//creating HashSet and adding element
				TreeSet<String>s=new TreeSet<String>();
				s.add("M");
				s.add("N");
				s.add("O");
				s.add("P");
				s.add("Q");
				System.out.println("Original set: "+s);
				System.out.println("Reverse set: "+s.descendingSet());
				System.out.println("Head set: "+s.headSet("O",true));
				System.out.println("sub set: "+s.subSet("M",true,"Q",false));
				System.out.println("Tail set: "+s.tailSet("O",false));
			

	}

}

*/




public class TreeSetEg {

	public static void main(String[] args) {
		//creating HashSet and adding element
				TreeSet<String>s=new TreeSet<String>();
				s.add("M");
				s.add("N");
				s.add("O");
				s.add("P");
				s.add("Q");
				System.out.println("Original set: "+s);
				System.out.println("Head set: "+s.headSet("O"));
				System.out.println("sub set: "+s.subSet("M","Q"));
				System.out.println("Tail set: "+s.tailSet("O"));
			

	}

}

