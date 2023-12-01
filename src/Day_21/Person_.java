package Day_21;

import java.util.Scanner;

class Encapsulation{
	private String name;
	private int age;
	private String country;
	
	//getter and setter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public void setName(String newValue) {
		name=newValue;
	}
	public void setAge(int newValue) {
		age=newValue;
	}
	public void setCountry(String newValue) {
		country=newValue;
	}
}

public class Person_ {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Encapsulation obj=new Encapsulation();
	    
		String name=s.nextLine();
		int age=s.nextInt();
		String country=s.next();
		obj.setName(name);
		obj.setAge(age);
		obj.setCountry(country);
		System.out.println("Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Country:"+obj.getCountry());

	}

}
