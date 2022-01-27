package study.inheritance.user;

import product.hasrelation.MyDate;
import study.inheritance.Student;

public class User1 {

	public static void main(String[] args) {
		Student s= new Student();
		s.setName("Ashu");
		s.setDob(new MyDate(22,5,2001));
		s.setRollno(17);
		System.out.println(s);
	}

}
