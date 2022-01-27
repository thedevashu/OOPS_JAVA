package study.inheritance.user;

import product.hasrelation.MyDate;
import study.inheritance.Employee;

public class User4 {

	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.setName("Emp1");
		emp.setDob(new MyDate());
		emp.setEid(001);
		emp.setDept("ENTC");
		emp.setSalary(10000);
		
		System.out.println(emp);
		
		Employee e =new Employee("Emp2",new MyDate(12,11,1990),212,"CSIT",1200);
		System.out.println(e);
	}
}
/*User4.java
		Create Employee object using first no-parameter constructor and setters  } print details
		Create Employee object using parameter constructor  } print details
	*/