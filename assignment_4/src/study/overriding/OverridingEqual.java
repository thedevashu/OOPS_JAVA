package study.overriding;

import product.hasrelation.MyDate;
import study.hasrelation.Circle;
import study.hasrelation.Point;

public class OverridingEqual {
	public static void main(String[] args) {
		MyDate d= new MyDate(1, 1, 2001);
		MyDate d1 =new MyDate(1,1,2001);
//		checkEqaulity(d,d1);

		Point p1 =new Point(21, 31);
		Point p2 =new Point(21, 31);
//		checkEqaulity(p1, p2);

		Circle c1 =new Circle(12, p1);
		Circle c2 =new Circle(112, p2);
		boolean b =c1.equals(c2);
		if(b) {
			System.out.println("Equale");
		}
		else
			System.out.println("Not Equale");
		checkEqaulity(c1, c1);
	}

	
	
	private static void checkEqaulity(Object obj1 ,Object obj2) {
		if(obj1 instanceof MyDate && obj2 instanceof MyDate) {
			MyDate tmp1 = (MyDate)obj1;
			MyDate tmp2 = (MyDate)obj2;
			if(tmp1.getDay() == tmp2.getDay() && tmp1.getMonth() == tmp2.getMonth() && tmp1.getYear() == tmp2.getYear()) {
			System.out.println(obj1+"Same"+obj2);
			}
			else {
			System.out.println(obj1+"Not Same"+obj2);
		}

		}

	}

}
