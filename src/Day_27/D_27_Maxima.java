package Day_27;

import java.util.Scanner;

public class D_27_Maxima {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=s.nextInt();
		System.out.print("Enter the array element: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("The Local maxima is "+max);
		
		
			
		
	}

}
