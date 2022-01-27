package study.inheritance;

import product.hasrelation.MyDate;

public class Person {
	private String name;
	private MyDate dob;
	public Person() {
		setName("");
		setDob(new MyDate(1,1,2000));
		System.out.println("<-----Person()------>");
	}
	public Person(String n,MyDate dob) {
		this.setName(n);
		this.setDob(dob);
		System.out.println("<-----Person(String,MyDate)------>");
	}
	public MyDate getDob() {
		return dob;
	}
	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return getName()+" "+ getDob();
	}
}
/*Create a hierarchy 
		Person (name,dob)
			Student isa Person  ( rollnumber)
		                       IntershipStudent  isa   Student ( stipend)
			Employee isa  Person    (  eid , dept, salary )
			Patient  isa  Person ( String disesaseDesc )
		  
	Each class will have 2 constructors  (   parameter and no-parameter --- please put a sysout as done in class )
	Each class should have getters and setters for their own properties 
	
	
	User1.java
		Create Student object with no parameter constructor , set all properties using setter and print them
		
	User 2 .java
		Create InternShipStudent object with parameter constructor  , print the details
		
	User3.java
	        Create an array of Patients 
			Accept values from user  
			Print the patient name , disease desc
			
			Print all the names of patients who are children --less than18
			
	User4.java
		Create Employee object using first no-parameter constructor and setters  } print details
		Create Employee object using parameter constructor  } print details
		
Draw memory diagrams for each user !!!!*/