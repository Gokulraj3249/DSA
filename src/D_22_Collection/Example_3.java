package D_22_Collection;

import java.util.ArrayList;

public class Example_3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	    ArrayList num=new ArrayList();
	    num.add(1);
	    num.add(7);
	    num.add(5);
	    num.add(6);
	    num.add("File1");
	    num.add("File2");
	   
	    System.out.println(num);
	    System.out.println("Number of element in ArrayList: "+num.size());

	}

}
