package D_22_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		System.out.print("Original contents of al: ");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
		Object element=itr.next();
		System.out.print(element+" ");
		}
		System.out.println();
		
		//modify object being iterated
		ListIterator litr=al.listIterator();
		while(litr.hasNext()) {
		Object element=litr.next();
		litr.set(element + " ");
		}
		System.out.print("Modified contents of al: ");
		itr=al.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
		//now,display the list backwards
		System.out.print("Modified list backwards: ");
		while(litr.hasPrevious()) {
			Object element=litr.previous();
			System.out.print(element+" ");
		}
		System.out.println();
		
	}

}
