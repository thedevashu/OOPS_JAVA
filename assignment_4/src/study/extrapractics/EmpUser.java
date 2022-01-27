package study.extrapractics;

import java.util.Scanner;

public class EmpUser {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of Employee");
		int size =sc.nextInt();
		Employee emp[] =new Employee[size];
		populateEmp(emp);
		displayEmp(emp);
		
	}

	private static void displayEmp(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
		
	}

	private static void populateEmp(Employee[] emp) {
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter Employe Id:");
			int id= sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name:");
			String nm = sc.nextLine();
			System.out.println("Enter Basic Pay:");
			int bsalary=sc.nextInt();
			emp[i]=new Employee(id,nm,bsalary);
		}
		
	}

}
