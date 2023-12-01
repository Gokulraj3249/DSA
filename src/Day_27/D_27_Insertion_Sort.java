package Day_27;

import java.util.Scanner;

public class D_27_Insertion_Sort {
    static void Insert(int arr[],int n) {
		int t,key;
		for(int step=0;step<n;step++) {
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
	}
    static void display(int arr[],int n) {
    	System.out.print("Output: ");
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
    }


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		Insert(arr,n);
		display(arr,n);
	}

}
