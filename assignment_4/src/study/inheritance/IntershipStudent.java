package study.inheritance;

import product.hasrelation.MyDate;

public class IntershipStudent extends Student {
	private int stipen;
	
	public IntershipStudent() {
		setStipen(1000);
		System.out.println("<-----IntershipStudent()----->");
	}
	public IntershipStudent(String n,MyDate d,int rol,int stip) {
		super(n,d,rol);
		setStipen(stip);
		System.out.println("<-----IntershipStudent(String,Mydate,int,int)----->");
		
	}
	public String toString() {
		String s =super.toString();
		return "Inter :"+s+" Stipen:"+stipen+"Rs";
	}

	public int getStipen() {
		return stipen;
	}

	public void setStipen(int stipen) {
		this.stipen = stipen;
	}

}
