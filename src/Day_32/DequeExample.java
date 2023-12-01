package Day_32;

import java.util.*;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer>number=new ArrayDeque<>();
		number.add(1);
		number.offerLast(2);
		number.offerFirst(3);
		System.out.println("Deque: "+number);
		
		int first=number.peekFirst();
		System.out.println("First Element: "+first);
		
		int last=number.peekLast();
		System.out.println("Last Element: "+last);
		
		int remove=number.pollFirst();
		System.out.println("Remove First Element: "+remove);
		
		int remov=number.pollLast();
		System.out.println("Remove Last Element: "+remov);
		
		System.out.println("Updata Deque: "+number);

	}

}
