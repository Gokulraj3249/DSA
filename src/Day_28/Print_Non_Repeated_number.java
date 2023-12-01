package Day_28;

import java.util.Scanner;

public class Print_Non_Repeated_number {

	public static void main(String[] args) {
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array element: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();

		System.out.println("The element are: ");
		for(int i=0;i<n;i++) {
				int count=0;
				for(int j=0;j<n;j++) {
					if(arr[i]==arr[j]&& i!=j)
						count++;
				}
				if(count==0) {
					System.out.print(arr[i]+" ");
					 flag=1;
				}
			}
		if(flag==0)
			System.out.println("All are repeated");
			
		

	}

}
