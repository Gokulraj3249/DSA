package Day_27;

import java.util.Scanner;

public class D_27_Rotate_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
       	System.out.println("The contents of the array before rotation are: ");
        for(int i=0;i<n;i++)
        	 System.out.print(arr[i]+" ");	
        System.out.println("\nEnter the number by which the array elements are to be rotated: ");
        int rot=s.nextInt();
        for(int r=0;r<rot;r++) {
        	int x=arr[0];
        	  for(int i=1;i<n;i++) {                    
            	  arr[i-1]=arr[i];
        	  }
              arr[n-1]=x;
        }
      System.out.println("The contents of the array after rotation are: ");
      for(int i=0;i<n;i++)
    	  System.out.print(arr[i]+" ");
        s.close();

	}

}
