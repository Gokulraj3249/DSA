package Day_30;

import java.util.*;

public class Stack_Reverse {
	static void reversePrint(Stack<Integer>s) {
		if(s.isEmpty())
			return;
		int x=s.peek();
		s.pop();
		System.out.print(x+" ");
		reversePrint(s);
		s.push(x);
	}

	public static void main(String[] args) {
		Stack<Integer>ss=new Stack<>();
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		ss.push(50);
		System.out.println("Stack Element in forward: ");
		System.out.println(ss);
		System.out.println("Stack Element in Reverse: ");
		reversePrint(ss);
		System.out.println();
		System.out.println("Stack Element in forward: ");
		System.out.println(ss);

	}

}
