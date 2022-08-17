package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//non generic
public class Mapeg1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<Integer, String>();
		//adding elements
		mp.put(1, "Pritam");
		mp.put(8, "Rahul");
		mp.put(2, "Sweta");
		mp.put(7, "Karan");
		//traversing elements
		Set set=mp.entrySet();//converting set so that we can traverse
		Iterator i=set.iterator();
		while(i.hasNext()) {
			//converting to map
			Map.Entry en=(Map.Entry)i.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}

	}

}
