package Array2d;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg {//class
	public static void main(String args[]) {
		List<String> al=new ArrayList<String>();//creating array list
		al.add("Rose");//add property of array (we can add the value)
		al.add("Sunflower");
		al.add("Lily");
		al.add("Daisy");
		al.add("Marigold");
		al.add("Tulip");
		al.add("Jasmine");
		System.out.println(al);
		
		List<String> all=new ArrayList<String>();//list 2
		all.add("Rose");
		all.add("Sunflower");
		all.add("Lily");
		all.add("Daisy");
		all.add("Marigold");
		all.add("Tulip");
		all.add("Jasmine");
		System.out.println(all);
		
		//compare array list
		boolean b= al.equals(all);
		System.out.println(b);
		all.add("Red Rose");
		boolean b1=al.equals(all);
		System.out.println(b1);
	}

}
