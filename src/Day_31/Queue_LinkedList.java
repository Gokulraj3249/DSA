package Day_31;

import java.util.*;

public class Queue_LinkedList {

	public static void main(String[] args) {
		Queue<Integer>num=new LinkedList<>();
		
		num.offer(1);
		num.add(2);
		num.add(3);
		num.offer(3);
		System.out.println("Queue: "+num);
		
		int acnum=num.element();
		System.out.println("Accessed Element: "+acnum);
		
		int renum=num.poll();
		System.out.println("Removed Element: "+renum);
		
		System.out.println("Updated Queue: "+num);

	}

}
