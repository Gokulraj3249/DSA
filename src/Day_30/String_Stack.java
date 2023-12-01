package Day_30;

import java.util.Stack;

//Program to display the top from the stack


public class String_Stack {

	public static void main(String[] args) {
		Stack<String>st=new Stack<>();
		st.push("Apple");
		st.push("Grapes");
		st.push("Mango");
		st.push("Orange");
		System.out.println("Stack: "+st);
		
		String fruits =st.peek();
		System.out.println("Element at top: "+fruits);

	}

}
