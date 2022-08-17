package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(101, "Mango");
		map.put(108, "Orange");
		map.put(105, "Banana");
		map.put(103, "Grapes");
		map.put(100, "Banana");
		map.put(null, null);
		map.put(102, null);
		map.put(null, "Apple");
		//traversing
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
