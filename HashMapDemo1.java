package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<Integer,String>();
		//adding elements
		mp.put(101, "Pritam");
		mp.put(102, "Rahul");
		mp.put(200, "Sweta");
		mp.put(100, "Karan");
		//traversing elements in any order
		for(Map.Entry en:mp.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}

	}

}
