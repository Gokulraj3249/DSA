package Day_31;

import java.util.*;

public class Queue_Priority {

	public static void main(String[] args) {
		Queue <Integer>num=new PriorityQueue<>();
		
		num.add(5);
		num.offer(1);
		num.offer(2);
		System.out.println("Queue: "+num);
		
		int acnum=num.peek();
		System.out.println("Accessed Element: "+acnum);
		
		int renum=num.poll();
		System.out.println("Remove Element: "+renum);
		
		System.out.println("Queue: "+num);

	}

}
