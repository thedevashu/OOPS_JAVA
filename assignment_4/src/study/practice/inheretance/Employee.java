package study.practice.inheretance;

public abstract class Employee extends Person {
	private int empid;
	private long bankAcNumber;
	private String role;
	private double basicSal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param empid
	 * @param bankAcNumber
	 * @param role
	 */
	public Employee(String name,int age,String gender,int empid, long bankAcNumber, String role,double basicSal) {
		super(name,age,gender);
		this.empid = empid;
		this.bankAcNumber = bankAcNumber;
		this.role = role;
		this.basicSal =basicSal;
	}
	
	public void setBasicSal(double sal) {
		this.basicSal=sal;
	}
	public double getBasicSal() {
		return this.basicSal;
	}
	
	public final void paySal() {
		System.out.println(calSalary());
	}
	//abstract method
	public abstract float calSalary(); 
	@Override
	public String toString() {
		
		return super.toString()+"" + empid + ", bankAcNumber=" + bankAcNumber + ", role=" + role + ", ";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public long getBankAcNumber() {
		return bankAcNumber;
	}

	public void setBankAcNumber(long bankAcNumber) {
		this.bankAcNumber = bankAcNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
