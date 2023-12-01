package Day_20;

import java.util.Scanner;

public class Right_angled_triangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input: ");
		s.useDelimiter("\\s");
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
		if(C*C==(A*A+B*B))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
