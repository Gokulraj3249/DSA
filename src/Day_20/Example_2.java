package Day_20;

import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//System.out.print("Enter the number of element: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		//System.out.print("Enter the array element: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		//System.out.print("Enter the K value: ");
		int k=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]%k==0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
			

	}

}
