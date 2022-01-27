package study.inheritance;

import product.hasrelation.MyDate;

public class Patient extends Person{

	private String disease;
	public Patient() {
		setDisease("NILL");
		System.out.println("<-----Patient()----->");
	}
	
	public Patient(String n,MyDate d, String dis) {
		super(n,d);
		setDisease(dis);
		System.out.println("<-----Patient(String,MyDate,String)----->");
	}
	
	public String toString() {
		String s = super.toString();
		return "Patient :"+s+" "+"Disease :" +disease;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
}
