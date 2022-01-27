package study.inheritance.user;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import product.hasrelation.MyDate;
import study.inheritance.Patient;

public class User3 {

	public static void main(String[] args) {
		GregorianCalendar cl =new GregorianCalendar();
		System.out.println("Enter no of patient");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		Patient p[] =new Patient[size];
		sc.nextLine();
		for (int s = 0; s < p.length; s++) {
			System.out.println("Enter patient name: ");
			String nm=sc.nextLine();
			
			System.out.println("Enter DOB");
			int d=sc.nextInt();
			int m =sc.nextInt();
			int y=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter disease: ");
			String des =sc.nextLine();
			
			p[s]=new Patient(nm,new MyDate(d,m,y),des);
			
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
		
		for (int i = 0; i < p.length; i++) {
			int age =cl.get(Calendar.YEAR) - p[i].getDob().getYear() ;
			if(age < 19)
				System.out.println((p[i])+" Age:"+age);
		}
	}

	

	

	

}
/*User3.java
	        Create an array of Patients 
			Accept values from user  
			Print the patient name , disease desc
			
			Print all the names of patients who are children --less than18
			
*/