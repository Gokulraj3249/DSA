package Program;

import java.util.*;

public class D_32_AddStrck {
	static void reverseprint(Stack<Integer>s) {
		if(s.isEmpty())
			return;
		int x=s.peek();
		s.pop();
		System.out.print(x+" ");
		reverseprint(s);
		s.push(x);
	}


	public static void main(String[] args) {
		Stack<Integer>ss=new Stack<>();
		ss.push(24);
		ss.push(5);
		ss.push(11);
		ss.push(36);
		ss.push(65);
		System.out.println("Stack Element: "+ss);
		
		int remove=ss.pop();
		System.out.println("Stack Element: "+ss);
		
		System.out.println("\nIterator: ");
		Iterator<Integer>it=ss.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" ");
		}
		
		System.out.println("\nReverse Order:");
		reverseprint(ss);
	}

}
