package Day_24;

import java.util.Scanner;

public class XOR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=n%4;
		if(x==0)
			System.out.print("The answer is "+n);  
		else if(x==1)
			System.out.print("The answer is 1");
		else if(x==2)
			System.out.print("The answer is :"+(n+1));
		else if(x==3)
			System.out.print("The answer is 0");
		
		

	}

}
