package collection;

import java.util.Map;
import java.util.TreeMap;

public class Treehashmapdemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(200,"riya");
		tm.put(205,"priya");
		tm.put(202,"rima");
		tm.put(208,"rohit");
		//descending order
		System.out.println("Decending map: "+tm.descendingMap());
		//headmap return keys pairs whose keys are less than/equal to specific value
		System.out.println("Head map: "+tm.headMap(201,true));
		//headmap return keys pairs whose keys are greater than/equal to specific value
		System.out.println("Tail map: "+tm.tailMap(201,true));
		//headmap return keys pairs exist between specified keys
		System.out.println("Sub map: "+tm.subMap(201,true,205,true));
		
		//sorted map
		System.out.println("Head map: "+tm.headMap(201));
		System.out.println("Tail map: "+tm.tailMap(201));
		System.out.println("Sub map: "+tm.subMap(201,205));
		
		for(Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			tm.remove(205);
			System.out.println("After removing:");
			for(Map.Entry m1 : tm.entrySet()) {
				System.out.println(m1.getKey()+" "+m1.getValue());
				
			}
		}

	}

}
