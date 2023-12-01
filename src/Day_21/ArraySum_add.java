package Day_21;

import java.util.Scanner;

public class ArraySum_add {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		if(sum%2==0 && sum%3==0 && sum%5==0)
			System.out.print("1");
		else
			System.out.print("0");
		

	}

}
