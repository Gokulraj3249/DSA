package Day_27;

import java.util.Scanner;

public class D_27_BubbleSort {
	static void bubble(int arr[],int n) {
		int t;
		for(int step=0;step<n-1;step++) {
			for(int i=0;i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
					t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
				}
					
			}
		}
		
	}
	static void display(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		bubble(arr,n);
		display(arr,n);
		s.close();

	}

}
