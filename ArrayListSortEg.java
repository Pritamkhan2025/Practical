package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {
	public static void main(String ...args) {
		//creating array list
				List <String> al=new ArrayList <String>();
				//adding object to array list
				al.add("Subrajit");
				al.add("Mamta");
				al.add("Monalisha");
				al.add("Anju");
				al.add("Samik");
				al.add("Pallabi");
				al.add("Khusbu");
				al.add("Bhaskar");
				al.add("Vanitha");
				al.add("Suruti");
				System.out.println("Sorting the array list:");
				//sorting array list
				Collections.sort(al);
				for(String s :al) {
					System.out.println(s);
				}
				System.out.println();
				
				
				List <Integer> all=new ArrayList <Integer>();
				//adding integer to array list
				all.add(20);
				all.add(30);
				all.add(40);
				all.add(60);
				all.add(40);
				all.add(80);
				all.add(50);
				all.add(80);
				all.add(70);
				all.add(90);
				System.out.println("Integer sorted list:");
				//sorting array list
				Collections.sort(all);
				for(Integer i :all) {
					System.out.println(i);
				}
				
	}

}
