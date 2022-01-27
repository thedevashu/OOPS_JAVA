package study.inheritance;

import product.hasrelation.MyDate;

public class Employee extends Person {

	private int eid;
	private String dept;
	private int salary;
	public Employee() {
		setEid(000);
		setDept("");
		setSalary(5000);
		System.out.println("<------Employee()----->");
	}
	
	public Employee(String n,MyDate dob,int eid,String dpt,int sal) {
		super(n,dob);
		
		setEid(eid);
		setDept(dpt);
		setSalary(sal);
		System.out.println("<------Employee(int,String,int)----->");
		
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		String p=super.toString();
		return "Employee:"+p+" "+getEid()+" "+getDept()+" "+getSalary();
	}

}
