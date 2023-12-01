package Program;

import java.util.*;

public class D_32_Unique_Words {
	//  Function to calculate the number of unique words
	static int calculateNoOfUniqueWords(String str) {
        String[] words = str.split(" ");  // i am am i
        boolean[] array = new boolean[words.length];
        // array ={false,false,false,false}
        int j, i = 0;
        int count = 0;
        for (i = 0; i < words.length; i++) {
            if (!array[i]) { //if(!false
                count++;
                for (j = i + 1; j < words.length; j++) {
                    if (words[j].compareTo(words[i]) == 0) {
                        array[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str;
        System.out.print("Input: ");
        str=s.nextLine();
        int count = calculateNoOfUniqueWords(str);
        System.out.println("unique words are: "+ count);

	s.close();
	}


}
