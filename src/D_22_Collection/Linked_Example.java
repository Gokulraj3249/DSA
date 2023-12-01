package D_22_Collection;

import java.util.LinkedList;

import java.util.Iterator;

public class Linked_Example {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		list.add("Alex");
		
		list.addFirst("Negan");
		list.addLast("Rick");
		list.add(2,"Glenn");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
//		list.removeFirst();
//		list.removeLast();
//		list.remove(4);
//		list.remove("Steve");
		System.out.println(list);
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
