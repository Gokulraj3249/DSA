package Day_24;

public class Swapping {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		System.out.print("Before Swapping, a= ");
		System.out.print(a);
		System.out.print(" ");
		System.out.print("b= ");
		System.out.print(b);
		System.out.println("");
		a ^=b; //a=a^b  101 ^ 111 = 010
		b ^=a; //b=b^a  111 ^ 010 = 101 = 5 = b 
		a ^=b; //a=a^b  010 ^ 101 = 111 = 7 = a
		System.out.print("After Swapping, a= ");
		System.out.print(a);
		System.out.print(" ");
		System.out.print("b= ");
		System.out.print(b);

	}

}
