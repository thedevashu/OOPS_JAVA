package study.practice.inheretance;

public class Dev extends Employee{
	private int LOC;

	public Dev(){

	}
	public Dev(int LOC,String name,int age,String gender,int empId,long bankAcNo,String role,double basicSal ) {
		
		super(name,age,gender,empId,bankAcNo,role,basicSal);
		this.LOC=LOC;
		
	}
	public String toString() {
		return super.toString() + " LOC ="+this.LOC;
	}
	public void setLOC(int LOC) {
		this.LOC=LOC;
	}

	public int getLOC() {
		return this.LOC;
	}
	@Override
	public float calSalary() {
		float A,B,C;
		A=(float)super.getBasicSal()+(float)(.25*super.getBasicSal());
		B=8000f;
		C=2+LOC;
		return A+B+C;
	}


}
