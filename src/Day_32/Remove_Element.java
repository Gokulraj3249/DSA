package Day_32;

import java.util.*;

public class Remove_Element {

	public static void main(String[] args) {
		ArrayDeque<String>aa=new ArrayDeque<>();
		aa.add("Dog");
		aa.add("Cat");
		aa.add("Cow");
		aa.add("Horse");
		aa.add("Hen");
		aa.add("Tiger");
		aa.add("Lion");
		System.out.println("ArrayDeque: "+aa);
		
		String element=aa.remove();
		System.out.println("Remove Element: "+element);
		
		System.out.println("New ArrayDeque: "+aa);
	
	    aa.remove("Cow");

		
		System.out.println("New ArrayDeque: "+aa);
		
		String Firstelement=aa.removeFirst();
		System.out.println("Remove First Element: "+Firstelement);
		
		String lastelement=aa.removeLast();
		System.out.println("Remove Last Element: "+lastelement);
		
		System.out.println("New ArrayDeque: "+aa);
		aa.clear();
		System.out.println("New ArrayDeque: "+aa);
		
	}

}
