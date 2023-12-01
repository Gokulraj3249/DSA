package Day_27;

import java.util.Scanner;

public class D_27_Work_out {
	static void replaceElement(int arr[],int n) {
		int max,temp;
		max=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			temp=arr[i];
			arr[i]=max;
			if(temp>max)
				max=temp;
		}
		arr[n-1]=0;
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array element: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		replaceElement(arr,n);
		printArray(arr,n);
		
		
			
			

	}

}
