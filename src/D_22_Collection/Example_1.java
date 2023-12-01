package D_22_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_1 {

	public static void main(String[] args) {
		//List
		List<String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		
		//sorting List in ascending order according to the natural ordering
		Collections.sort(list);
		list.forEach(System.out::println);
		// or
		for(String str:list)
			System.out.println(str);

	}

}
