package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEg {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
		
		for(String s: dq) {
			System.out.println(s);
			dq.addFirst("Shree");
			dq.addLast("Riya");
			System.out.println("New List:");
			for(String s1: dq) {
				System.out.println(s1);
			}
			dq.removeFirst();
			dq.removeLast();
			System.out.println("New List after removal:");
			for(String s1: dq) {
				System.out.println(s1);
			}
			
		}

	}

}
