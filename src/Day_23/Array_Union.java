package Day_23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_Union {

	public static void main(String[] args) {
		Integer[]array= {1,2,3,4,5};
		Integer[]array1= {5,3,6,7,9};
		Set<Integer>set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(array));
		Set<Integer>set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(array1));
		
		//Finding Union of set1 and set2
		Set<Integer>union_data=new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("Union =");
		System.out.println(union_data);
		
		//Finding Intersection of set1 and set2
		Set<Integer>intersection_data=new HashSet<Integer>(set1);
		intersection_data.retainAll(set2);
		System.out.print("Intersection =");
		System.out.println(intersection_data);
		
	

	}

}
