package Day_21;

import java.util.Scanner;

public class Series_number {

	public static void main(String[] args) {
		int print=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			print=(i*i)+1;
			System.out.print(print+" ");
		}

	}

}
