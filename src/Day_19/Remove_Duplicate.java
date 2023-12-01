package Day_19;

import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,count=0,flag=0;
		System.out.print("Enter the size of the array:");
		n=s.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[n];
		System.out.println("Enter array elements in sorted order: ");
		 for(int i=0;i<n;i++) {
			 arr[i]=s.nextInt();}
System.out.println("After removing duplicates is: ");
for(int i=0;i<n;i++) {
	if(i==0)
		temp[count++]=arr[i];
	else {
		for(int j=0;j<count;j++) 
		{
		if(arr[i]==temp[j]) {
			flag=1;
			break;
			}
	}
	if(flag==0)
		temp[count++]=arr[i];
	}
	
	}
	for(int i=0;i<count;i++)
		System.out.print(temp[i]+" ");
	s.close();

	}

}
