package Day_31;

import java.util.*;

public class Priority_ex1 {

	public static void main(String[] args) {
				Queue <Integer>num=new PriorityQueue<>();
				
				num.add(4);
				num.offer(1);
				num.offer(2);
				System.out.print("PriorityQueue using iterator():");
				
				Iterator<Integer>it=num.iterator();
				while(it.hasNext()) {
					System.out.print(it.next());
					System.out.print(",");
				}
	}

}
