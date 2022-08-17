package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("Akash");
		queue.add("Sayan");
		queue.add("Sankhajit");
		queue.add("Hasan");
		queue.add("Jaita");
		queue.add("Owasim");
		queue.add("Tanmoy");
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue.peek());
		System.out.println("Iterating the queue elements: ");
		
		Iterator <String>itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.poll();
		queue.poll();
		System.out.println("After removing: ");
	    
		Iterator<String> itr2=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr2.next());
		}
		

	}

}
