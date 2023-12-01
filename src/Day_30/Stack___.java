package Day_30;

import java.util.*;

public class Stack___ {

	 
	public static void main(String[] args) {
		
		Stack<String>st=new Stack<>();
		System.out.println(st.isEmpty());
		st.push("Mac Book");
		st.push("HP");
		st.push("DELL");
		st.push("Asus");
		st.push("Linux");
		System.out.println("Stack: "+st);
		
		//Using Search
		int location=st.search("HP");
		System.out.println(st.search("Test"));
		System.out.println("Location of HP: "+location);
		
		//Using Size
		System.out.println();
		System.out.println("Size: "+st.size());
		
		//Using Iterator
		System.out.println();
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			Object values=it.next();
			System.out.println(values);
		}
		
		//Using forEach
		System.out.println("\nFor Each: ");
		st.forEach(n-> System.out.println(n));
		
		//Stack in reverse
		ListIterator<String>ListIterator=st.listIterator(st.size());
		System.out.println("\nIterator over the Stack from top to bottom:");
		while(ListIterator.hasPrevious()) {
			String avg =ListIterator.previous();
			System.out.println(avg);
		}

	}

}
