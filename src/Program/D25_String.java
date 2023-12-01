package Program;

import java.util.Scanner;

public class D25_String {

	public static void main(String[] args) {
		int upper=0,lower=0,vowel=0,consonant=0,space=0,special=0,digit=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
//			if(Character.isLetter(ch[i])) {
				 if(Character.isUpperCase(ch[i]) && upper==0) {
						System.out.println("Capital letter:"+(i+1));
						upper++;
				 }
				 if(Character.isLowerCase(ch[i]) && lower==0) {
						System.out.println("Small letter:"+(i+1));
						lower++;
//			}
			}
			else if(ch[i]!=' '&& special==0 ) {
				System.out.println("Special:"+(i+1));
				special++;
			}
			else if (Character.isDigit(ch[i])) {
				digit++;
			}
			else if(ch[i]==' '&& space==0) {
				System.out.println("Space:"+(i+1));
				space++;
			}
			
			if(vowel==0) {
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
						||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
					System.out.println("Vowel:"+(i+1));
				vowel++;
				}
			  else if(consonant==0){
				System.out.println("Consonant:"+(i+1));
				 consonant++;
			}}
			
			
		}
		
	}

}
