package Day_23;

import java.util.*;

public class TreeMapExample_1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeMap<String,Integer>t=new TreeMap<String,Integer>();
		t.put("roy", 90);
		t.put("shelly", 80);
		t.put("keats", 95);
		t.put("charles", 38);
		
		Set s=t.entrySet();
		Iterator i=s.iterator();
		System.out.println("the following are the marks: ");
		System.out.println("names\t\tmarks ");
		
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		if(t.containsKey("roy"))
			System.out.println("Map contains the enter 'roy'");
		else
			System.out.println("Map doenot contains the enter 'roy'");
		t.put("macbeth",58);
		i=s.iterator();
		System.out.println("the tree map after modification is: ");
		System.out.println("names\t\tmarks ");
		while(i.hasNext()) {
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+"\t\t" +e.getValue());
		}
		

	}

}
