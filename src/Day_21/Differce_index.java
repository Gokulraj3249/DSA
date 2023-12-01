package Day_21;

import java.util.Scanner;

public class Differce_index {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=0,c;
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<arr[b]) {
				b=i;
			}
			else if(arr[i]>arr[a]) {
				a=i;
			}
		}
		c=a-b;
			System.out.print(c);
		

	}

}
