package Day_24;

public class PowerofTwo {
	static  boolean isPowerOfTwo(int x) {
		return(x!=0) && ((x&(x-1))==0);
	}

	public static void main(String[] args) {
	    System.out.println(isPowerOfTwo(11));
	    int number=0b1001;
		System.out.println(number);

	}

}
