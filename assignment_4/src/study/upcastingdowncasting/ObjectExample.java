package study.upcastingdowncasting;

import java.util.Scanner;

import study.inheritance.Employee;

public class ObjectExample {

	public static void main(String[] args) {
		String str =new String();
//		str="hello";
//		func1(str ="hello");
//		func1(new Scanner(System.in));
		func1(new Employee());
		

	}

	private static void func1(Object obj) {
		System.out.println(obj.hashCode());
		
		if (obj instanceof Employee) {
			Employee temp =(Employee)obj;
			temp.setSalary(120000);
			temp.setName("name");
			System.out.println(temp.getSalary()+""+obj+""+temp);
		}
		
		if(obj instanceof Scanner) {
			 
			 System.out.println(obj.hashCode());
			 System.out.println(((Scanner)obj)+"\n"+((Scanner)obj).nextLine());
		}
		
		if(obj instanceof String)
			System.out.println(((String)obj).toUpperCase());
	}

}
