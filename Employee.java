package cycle2;

import java.util.*;

public class Employee {
	int employeeid;
	String fname;
	float salary;

	public void getInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee id : ");
		employeeid = sc.nextInt();
		System.out.print("Enter the name : ");
		fname = sc.next();
		System.out.print("Enter the salary : ");
		salary = sc.nextFloat();
	}

	public String toString() {

		return ("Employee id = " + employeeid + "\nEmployee name = " + fname + "\nEmployee salary = " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter no. of employees:");
		int n = in.nextInt();
		Employee e[] = new Employee[n];
		for (int i = 0; i < n; i++) {

			e[i] = new Employee();
			e[i].getInput();
		}
		System.out.println("Enter employee id :");
		int employeeno = in.nextInt();
		for (int i = 0; i < n; i++) {
			if (e[i].employeeid == employeeno) {
				System.out.println(e[i]);
			}
		}

		in.close();
	}

}
