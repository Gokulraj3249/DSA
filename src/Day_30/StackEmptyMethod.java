package Day_30;

import java.util.Stack;

public class StackEmptyMethod {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<>();
		boolean result=stk.empty();
		System.out.println("Is the stack empty? "+result);
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		System.out.println("Elements in Stack: "+stk);
	    result=stk.empty();
		System.out.println("Is the stack empty? "+result);
		//System.out.println("Elements in Stack: "+stk.peek());
	}

}
