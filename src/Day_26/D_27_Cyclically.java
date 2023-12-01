package Day_26;

import java.util.Scanner;

public class D_27_Cyclically {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Ente the size of the array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter th array element: ");
		for(int i=0;i<n;i++) 
			arr[i]=s.nextInt();
		System.out.println("The initial array is: ");
		for(int i=0;i<n;i++) 
			  System.out.print(arr[i]+" ");
			  for(int r=0;r<n-1;r++) {
		        	int x=arr[n-1];
		       for(int i=n-1;i>0;i--)  
		            	  arr[i]=arr[i-1];
		              arr[0]=x;}
		              System.out.println("\nThe array after permutation is: ");
		       for(int i=0;i<n;i++)
		            	  System.out.print(arr[i]+" ");
	}
	

}
