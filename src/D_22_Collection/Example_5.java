package D_22_Collection;

import java.util.ArrayList;
		import java.util.Iterator;
		import java.util.LinkedList;

		import javax.print.DocFlavor.STRING;

		@SuppressWarnings("unused")
		public class Example_5 {

			public static void main(String[] args) {
				LinkedList<String> list =new LinkedList<String>();
				
				//covert arraylist into linkedlist 
				LinkedList<String> llistobj =new LinkedList<String>();
				ArrayList <String> arraylist=new ArrayList<String>();
				arraylist.add("string 1");
				arraylist.add("string 2");
				llistobj.addAll(arraylist);
				System.out.println(llistobj);
				
				list.add("hcl");
				list.add("bbl");
				list.add("bike");
				list.add("car");
				list.add(2,"carl");
				list.set(1,"movie");
				//collection.sort(list);
				list.forEach(System.out::println);
				
				list.remove(2);
				
				list.addFirst("ibm");

				list.addLast("pwc india ");
				
				System.out.println(list.indexOf("imarticus"));
				
				System.out.println(list.get(4));
				
				System.out.println(list.size());
				
				System.out.println(list.contains("imar"));
				
				System.out.println(list.getFirst());
				
				System.out.println(list.getLast());
				
				Iterator<String> iter=list.iterator();
				while(iter.hasNext()){
					System.out.println(iter.next());
				}
				
			
		

	}

}
