package Day_21;

import java.util.Scanner;

public class Small_To_Largest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int min_idx=0,max_idx=0;
		int n=s.nextInt();
		int arr[]=new int[n];
		for( int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<arr[min_idx])
				min_idx=i;
			else if (arr[i]>arr[max_idx])
				max_idx=i;
			
		}
		System.out.print(min_idx+1+" ");
		System.out.print(max_idx+1);

	}

}
