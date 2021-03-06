package study.practice.inheretance;

public class Manager extends Employee {
	private int maxTeamSize;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(int teamSize,String name,int age,String gender,int empId,long bankAccountNo,String role,double basicSal) {
		super(name,age,gender,empId,bankAccountNo,role,basicSal);
		this.maxTeamSize=teamSize;
	}
	public void setMaxTeamSize(int teamSize) {
		this.maxTeamSize = teamSize;
	}
	public String toString() {
		return super.toString() +"Team Size="+maxTeamSize;
	}
	@Override
	public float calSalary() {
		float A= (float)super.getBasicSal() + (float)(0.5*super.getBasicSal());
		float B=10000f;
		return A+B;
	}

}
