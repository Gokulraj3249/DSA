package Day_18;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of element: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array elements one by one: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.print("Enter the position you want to insert: ");
		int pos=s.nextInt();
		int j=pos;
		while(j<n) {
			arr[j-1]=arr[j];
			j++;
		}  
		System.out.println("Array Traverse");
		for(int i=0;i<n-1;i++)   
		System.out.print(arr[i]+" ");
		s.close();

	}

}
