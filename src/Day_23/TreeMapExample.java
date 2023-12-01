package Day_23;

import java.util.*;
public class TreeMapExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeMap<Integer,String>hmap=new TreeMap<Integer,String>();
		hmap.put(1,"Data1");
		hmap.put(23,"Data2");
		hmap.put(70,"Data3");
		hmap.put(4,"Data4");
		hmap.put(2,"Data5");
		
		//Display content using Iterator
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.print("Key is: "+mentry.getKey()+" & Value is: ");
			System.out.println(mentry.getValue());
		}

	}

}
