package Day_20;

import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N, L,R ;
		N = s.nextInt();
		s.useDelimiter("[\\s]+");
		L = s.nextInt();
		R =s.nextInt();
		if(N>=L && N<=R)
			System.out.print("Yes");
		else
			System.out.print("No");

		s.close();

		
	}

}
