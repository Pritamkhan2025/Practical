package collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stackeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		//pushing elements
		pushelement(s,15);
		pushelement(s,65);
		pushelement(s,27);
		pushelement(s,50);
		pushelement(s,45);
		//popping elements
		popelement(s);
		popelement(s);
		//checking empty stack if yes
		try {
			popelement(s);
		}
		catch(EmptyStackException e) {
			System.out.println("Empty stack");
		}
	}
	
	//push operation
	@SuppressWarnings("removal")
	private static void pushelement(Stack<Integer> s, int i) {
		//invoke push() method
			s.push(new Integer(i));
			System.out.println("push: "+i);
			System.out.println("stack: "+s);//modified stack
		
	}
	//pop operation
	private static void popelement(Stack<Integer> s) {
		//invoke pop method
		Integer i= (Integer)s.pop();
		System.out.println("pop: "+i);
		System.out.println("stack: "+s);//modified stack
	
}
	

}
