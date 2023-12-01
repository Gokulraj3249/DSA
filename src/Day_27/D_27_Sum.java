package Day_27;

import java.util.Scanner;

public class D_27_Sum {

	public static void main(String[] args) {
		int sum=0;
		double avg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<n;i++)
			
			sum=sum+arr[i];
		System.out.println(sum);
		avg=(double)sum/n;
		System.out.println(avg);
			

	}

}
