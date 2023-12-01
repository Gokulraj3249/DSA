package D_22_Collection;

import java.util.ArrayList;

import java.util.List;

public class Add {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("HCL");
		list.add("DELL");
		list.add("TCS");
		list.add("Tech Mahindra");
		list.add(2,"Zoho");
		list.set(1,"Imarticus");
		list.remove(1);
		
		list.forEach(System.out::println);



	}

}
