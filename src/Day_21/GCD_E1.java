package Day_21;

import java.util.Scanner;

public class GCD_E1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int gcd=1;
		    for(int i=1;i<=n1 && i<=n2;i++) {
				 if(n1 % i==0 && n2 % i==0) {
//					 gcd=i;
			
		    System.out.println(gcd);
		    
				 }
				 else
					 System.out.print("-"+gcd);
				 
		    }


	}

}
