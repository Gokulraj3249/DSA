package Program;

import java.util.*;

public class D_32_Deque {

	public static void main(String[] args) {
		Deque<String>e=new ArrayDeque<>();
		e.add("one");
		e.add("two");
		e.add("three");
		e.add("four");
		e.add("five");
		System.out.println("Element= "+e);
		e.addFirst("red");
		e.addLast("blue");
		System.out.println("Element= "+e);
		System.out.println("Peek Element= "+e.peek());
		System.out.println("Remove the Element= "+e.removeFirst());
		System.out.println("Remove the Element= "+e.removeLast());
		System.out.println("Element= "+e);
		e.remove("three");
		System.out.print("\nReverse Elements: ");
		Iterator<String>desIterate=e.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next()+",");
			
		}
		
		

	}

}
