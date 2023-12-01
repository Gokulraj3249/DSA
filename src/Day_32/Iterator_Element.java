package Day_32;

import java.util.*;

public class Iterator_Element {

	public static void main(String[] args) {
		ArrayDeque<String>a1=new ArrayDeque<>();
		a1.add("Dog");
		a1.add("Cat");
		a1.add("Cow");
		a1.add("Horse");
		a1.add("Hen");
		a1.add("Tiger");
		a1.add("Lion");
		//   Using Iterator()
		System.out.println("\nArray Deque: ");
		Iterator<String>it=a1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(",");
		}
		
		System.out.println("\nArrayDeque in reverse order: ");
		//  using descendingIterator()
		Iterator<String>deit=a1.descendingIterator();
		while(deit.hasNext()) {
			System.out.print(deit.next());
			System.out.print(",");
		}

	}

}
