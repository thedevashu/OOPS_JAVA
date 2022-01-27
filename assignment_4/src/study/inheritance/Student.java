package study.inheritance;

import product.hasrelation.MyDate;

public class Student extends Person {

	private int rollno;
	public Student() {
		setRollno(0);
		System.out.println("<-----Student()-----> ");
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student(String n, MyDate dob,int r) {
		super(n, dob);//Super class paramerterize constructor call
		setRollno(r);
		System.out.println("<-----Student(String,MyDate,int)----->");
	}
	
	public String toString() {
		String person = super.toString();
		return "Student "+person+" "+this.getRollno();
	}
	

}
