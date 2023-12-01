package Day_21;

import java.util.Scanner;

class em {
		private String Em_id;
		private String Em_name;
		private Double salary;
		
		public String getem_id() {
			return Em_id;
		}
		public String getem_name() {
			return Em_name;
		}
		public Double getsala() {
			return salary;
		}
		public void setem_id(String newValue) {
			Em_id=newValue;
		}
		public void setem_name(String newValue) {
			Em_name=newValue;
		}
		public void setsala(Double newValue) {
			salary=newValue;
		}
	}
	
public class Employee_ {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		em obj=new em();
		String em_id=s.next();
		s.nextLine();
		String em_name=s.nextLine();
		Double salary=s.nextDouble();
		obj.setem_id(em_id);
		obj.setem_name(em_name);
		obj.setsala(salary);
		System.out.println("Employee Details:");
		System.out.println("ID:"+obj.getem_id());
		System.out.println("Name: "+obj.getem_name());
		System.out.printf("Salary: $%.2f",obj.getsala());
		

	}

}
