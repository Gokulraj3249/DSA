package Day_20;

import java.util.Scanner;

public class Reverse_Word {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String[]words=str1.split(" ");
		System.out.println(words[1]+" "+words[0]);

		s.close();
	}

}
