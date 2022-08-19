package collection;

import java.util.LinkedHashMap;
import java.util.Map;


public class Linkedhashmapdemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		//adding element
		lhm.put(200,"riya");
		lhm.put(205,"priya");
		lhm.put(202,"rima");
		lhm.put(208,"rohit");
		//key
		System.out.println("Keys are: "+lhm.keySet());
		//values
		System.out.println("Values are: "+lhm.values());
		//key-value pair
		System.out.println("Keys-values pair are: "+lhm.entrySet());
		//remove map element
		lhm.remove(202);
		
		//traversing map
		for(Map.Entry m: lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
