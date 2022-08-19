package collection;

import java.util.Stack;

public class Stackeg {

	public static void main(String[] args) {
		// creating stack class
		Stack<Integer> s=new Stack<>();
		//checking empty or not
		boolean result=s.empty();
		System.out.println("is the stack empty ? "+result);
		//adding element(push)
		s.push(25);
		s.push(42);
		s.push(85);
		s.push(73);
		s.push(64);
		s.push(59);
		
		//display the element
		System.out.println("elements are: "+s);
		Integer digit=s.peek();//access element from the top of the stack
		System.out.println("top element: "+digit);
		
		//search element
		int digit1=s.search(85);
		System.out.println("search element: "+digit1);
		
		//find of the size of the stack
		int x=s.size();
		System.out.println("Stack size: "+x);
		
		//checking empty or not
		result=s.empty();
		System.out.println("is the stack empty ? "+result);
		
	}

}
