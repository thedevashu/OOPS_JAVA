package study.practice.inheretance;

public class QA extends Employee {
	private int NOT;
	public QA() {
		// TODO Auto-generated constructor stub
	}
	
	public QA(int NOT,String name,int age,String gender,int empId,long bankAccountNo,String role,double basicSal)
	{
		super(name,age,gender,empId,bankAccountNo,role,basicSal);
		this.NOT =NOT;
	}
	
	
	public String toString() {
		return super.toString()+ " NOT="+this.NOT;
	}
	public int getNOT() {
		return this.NOT;

	}
	public void setNOT(int NOT) {
		this.NOT=NOT;
	}

	@Override
	public float calSalary() {
		float A,B,C;
		A=(float)super.getBasicSal()+ (float)(.2*super.getBasicSal());
		B=8000f;
		C=10*NOT;
		return A+B+C;
	}

}
