package Day_20;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.useDelimiter("[\\s+]");
		int N=s.nextInt();
		int M=s.nextInt();
		if(N==M)
			System.out.print("Yes");
		else
			System.out.print("No");
		s.close();
		

	}

}
