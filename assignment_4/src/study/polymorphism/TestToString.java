package study.polymorphism;

import book.hasrelation.Book;
import product.hasrelation.MyDate;
import study.hasrelation.Circle;
import study.hasrelation.Point;
import study.inheritance.Employee;

public class TestToString {

	public static void main(String[] args) {
		//MyDate d= new MyDate(12, 1, 2222);
		//check(d);

		//Circle c =new Circle(12, new Point(1,2));
		//check(c);
		
//		Point p =new Point(12,23);
//		check(p);
		
//		String[] aut= {"aut1","aut2","aut3"};
//		Book b= new Book("book", 129, aut);
//		check(b);
		
		Employee e =new Employee("sardya", new MyDate(1,2,1919), 1007, "ITUS", 1200021200);
		check(e);
	}

	private static void check(Object obj) {
		System.out.println(obj);		
	}

}
