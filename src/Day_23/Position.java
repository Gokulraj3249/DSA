package Day_23;

import java.util.Scanner;

public class Position {
		public static void main(String[] arge){
			int a[]={3,6,7,8,5,4,4,3};
			Scanner s=new Scanner(System.in);
			int key=s.nextInt();
			int position = -1;  // Initialize the position as -1 (not found)
		        for (int i = 0; i < key; i++) {
		            if (a[i] == key) {
		                position = i + 1; // Position is 1-based
		                break;
		            }
		        }

		        if (position != -1) {
		            System.out.println("Element found at position: " + position);
		        } else {
		            System.out.println("Element not found in the array.");
		        }
}}
