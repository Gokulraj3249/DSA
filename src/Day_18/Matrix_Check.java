package Day_18;

import java.util.Scanner;

public class Matrix_Check {

	public static void main(String[] args) {
		int r1,r2,c1,c2,count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the r1: ");
		r1=s.nextInt();
		System.out.print("Enter the r2: ");
		r2=s.nextInt();
		System.out.print("Enter the c1: ");
		c1=s.nextInt();
		System.out.print("Enter the c2: ");
		c2=s.nextInt();
		if(r1==r2 && c1==c2) {
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			System.out.println("Enter the A matrix elements: ");
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++)
					a[i][j]=s.nextInt();
			}
			System.out.println("Enter the B matrix elements: ");
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++)
					b[i][j]=s.nextInt();
			}
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					if (a[i][j]!=b[i][j]) {
						count++;
						break;
					}
			}
				}
			if(count==0)
				System.out.println("Both Matrix are same");
			else
				System.out.println("Both Matrix are not same");
		}
		else
			System.out.println("Rows and Columns are not same.");

	}

}
