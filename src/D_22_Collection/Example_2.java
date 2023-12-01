package D_22_Collection;

import java.util.ArrayList;

public class Example_2 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Steve");
		list.add("Tim");
		list.add("Lucy");
		list.add("Pat");
		list.add("Angela");
		list.add("Tom");
		System.out.println(list);
		
		list.remove("Steve");
		list.remove("Angela");
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		for(String str:list)
			System.out.println(str);
			
		System.out.println("Number of element in ArrayList: "+list.size());
		

	}

}
