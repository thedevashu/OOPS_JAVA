package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student_IET stud = new Student_IET();
		System.out.println("Enter first name");
		Scanner scn =new Scanner(System.in);
		String nm =scn.nextLine();
		stud.setF_name(nm);
		System.out.println("Enter Last name");
		String lnm =scn.nextLine();
		stud.setL_name(lnm);
		System.out.println("Enter age");
		int age =scn.nextInt();
		stud.setAge(age);
		
		System.out.println("Enter grad year");
		int gyr =scn.nextInt();
		stud.setGrad_yr(gyr);
		
		System.out.println("Enter Stream");
		String st = scn.nextLine();
		st = scn.nextLine();
		stud.setGrad_stream(st);
		System.out.println(stud);
	}

}
