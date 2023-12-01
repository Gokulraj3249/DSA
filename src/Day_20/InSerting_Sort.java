package Day_20;

import java.util.Scanner;

public class InSerting_Sort {
	static void insertingSort(int n,int arr[]) {
		int t,key;
		for(int step=1;step<n;step++) {
			key=step;
			for(int i=0;i<step;i++) {
				if(arr[i]>arr[key]) {
					t=arr[i];
					arr[i]=arr[key];
					arr[key]=t;
				}
			}
		}
		}
	/*static void insertingSort(int n,int arr[]) {
		int t,key;
		for(int step=1;step<n;step++) {
			key=step;
			for(int i=step-1;i>=0;i--) {
				if(arr[i]>arr[key]) {
					t=arr[i];
					arr[i]=arr[key];
					arr[key]=t;
					key--;
				}
			}
		}
		}*/
		static void printArray(int n, int arr[]) {
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
		insertingSort(n,arr);
		printArray(n,arr);
		s.close();

	}

}
