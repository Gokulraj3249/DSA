package Program;

import java.util.Scanner;

		public class Merge_collection {
			static void insertionSort(int m,int merge[]) {
				int t,key;
				for(int step=1;step<m;step++) {
					key=step;
					for(int i=step-1;i>=0;i--) {
						if(merge[i]>merge[key]) {
							t=merge[i];
							merge[i]=merge[key];
							merge[key]=t;
							key--;
						}
					}
				}
			}
			static void printArray(int m,int merge[]) {
				System.out.println("The merged array is");
				for(int i=0;i<m;i++) {
					System.out.print(merge[i]+" ");
				}
			}
			
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the size of the two array:");
				int n=s.nextInt();
				int n1=s.nextInt();
				int arr1[]=new int[n];
				int arr2[]=new int[n1];
				int m=arr1.length+arr2.length;
				int merge[]=new int[arr1.length+arr2.length];
			//	System.out.println("The size of merge array="+(arr1.length+arr2.length));
			    System.out.print("Enter the first array elements:");
			    for(int i=0;i<n;i++) {
			    	arr1[i]=s.nextInt();
			    	   }
			    System.out.print("Enter the Second array elements:");
			    for(int j=0;j<n;j++) {
			    	arr2[j]=s.nextInt();
			    }
			    for(int i=0;i<arr1.length;i++) {
			    	merge[i]=arr1[i];
			    	   	}
			    for(int i=0 , j=arr1.length;j<(arr1.length+arr2.length);j++,i++) {
			    	merge[j]=arr2[i];
			    	    }
				insertionSort(m,merge);
				printArray(m,merge);


	}

		}
