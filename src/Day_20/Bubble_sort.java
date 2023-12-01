package Day_20;

import java.util.Scanner;

public class Bubble_sort {
	 static void bubbleSort(int n,int arr[]) {
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
	static void printArray(int n,int arr[]) {
		System.out.println("After after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the array element: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		bubbleSort(n,arr);
		printArray(n,arr);
		s.close();

	}

}
