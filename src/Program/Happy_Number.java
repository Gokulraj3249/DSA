package Program;

import java.util.*;

public class Happy_Number {
	 static int check_happy_number(int num){  
		  int rem =0,sum = 0; 
		  while(num > 0){  
		      rem = num%10;  
		      sum = sum + (rem*rem);  
		      num = (num/10);  
		  }  
		  return sum;  
		} 

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input: ");
		int num=s.nextInt();  
			int result = num;  
			 while(result != 1 && result != 4){  
		           result = check_happy_number(result);  
		       }  
			if(result == 1)  
			 System.out.print(num + " : is a happy number"); 
			else if(result == 4)  
			  System.out.print(num + " : is not a happy number");  

	}

}
