package Day_20;

import java.util.Scanner;

public class Char_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		//System.out.println(str1);
		int n=str1.length();
		char ch[]=str1.toCharArray();
		//for(int i=0;i<n;i++)
			//System.out.print(ch[i]);
		//System.out.println();
		for(int i=0;i<n-1;i+=2) {
			System.out.print(ch[i+1]+""+ch[i]);
		}

	}

}
