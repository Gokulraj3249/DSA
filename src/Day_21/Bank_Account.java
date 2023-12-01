package Day_21;

import java.util.Scanner;
 class Bank{
	private String Account_number;
	private float Balance;
	public String getaccount() {
		return Account_number;
	}
	public float getbalance() {
		return Balance;
	}
	public void setaccount(String newValue) {
		Account_number=newValue;
	}
	public void setbalance(float newValue) {
		Balance=newValue;
	}
}

public class Bank_Account {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank obj=new Bank();
	    
		String account=s.next();
		float balance=s.nextInt();
		obj.setaccount(account);
		obj.setbalance(balance);
		System.out.println("Account Number:"+obj.getaccount());
		System.out.println("Balance: "+obj.getbalance());


	}

}
