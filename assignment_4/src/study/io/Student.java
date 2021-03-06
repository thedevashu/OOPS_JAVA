package study.io;

import java.io.Serializable;

public class Student implements Serializable {
	@Override
	public String toString() {
		return "Student [name=" + name + ", dob=" + dob + "]";
	}

	private String name;
	private MyDate3 dob;

	public Student() {
		dob =new MyDate3();
		name ="";
	}

	/**
	 * @param name
	 * @param dob
	 */
	public Student(String name, MyDate3 dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	

}
