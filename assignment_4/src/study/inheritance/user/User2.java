package study.inheritance.user;

import product.hasrelation.MyDate;
import study.inheritance.IntershipStudent;

public class User2 {

	public static void main(String[] args) {
		IntershipStudent istd =new IntershipStudent("Ashu",new MyDate(2,2,2002),17,6000);
		System.out.println(istd);

	}

}
