package Program;

import java.util.*;

public class D_32_Queue {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>();
		q.add(11);
		q.add(5);
		q.add(25);
		q.add(34);
		q.add(96);
		q.add(112);
		System.out.println("Queue= "+q);
		System.out.println("Accessed Element: "+q.peek());
		System.out.println("Remove Element: "+q.poll());
		System.out.println("Remove Element: "+q.remove(34));
		System.out.println("Updated Queue= "+q);
		

	}

}
