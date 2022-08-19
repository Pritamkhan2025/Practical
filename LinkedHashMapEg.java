package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map1=new LinkedHashMap<Integer,String>();
		map1.put(101, "Mango");
		map1.put(108, "Orange");
		map1.put(105, "Banana");
		map1.put(103, "Grapes");
		map1.put(100, "Banana");
		map1.put(null, null);
		map1.put(102, null);
		map1.put(null, "Apple");
		

	}

}
