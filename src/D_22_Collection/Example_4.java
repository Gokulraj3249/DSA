package D_22_Collection;

import java.util.ArrayList;
import java.util.List;

public class Example_4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech Mahindra");
		list.add(2,"Zoho");
		list.set(1,"Imarticus");
		
		list.forEach(System.out::println);
		
		list.remove(2);
		
		System.out.println(list.indexOf("Imarticus"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("Hello"));
		
		
		list.clear();
		
		System.out.println(list);


	}

}
