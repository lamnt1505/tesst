package slide3;

import java.util.Scanner;

public class Dog {
	public String fullname;
	public double salary;
	
	/**
	 * 
	 */
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name");
		this.fullname = scan.nextLine();
		
		System.out.print("Salary");
		this.salary = scan.nextDouble();
	}
	
	public void output() {
		System.out.println(this.fullname);
		System.out.println(this.salary);
	}
	/**
	 * @param args
	 * tạo đối tượng
	 */
	public static void main(String []args) {
		Dog emp = new Dog();
		emp.input();
		emp.output();
	}
	
	
}
