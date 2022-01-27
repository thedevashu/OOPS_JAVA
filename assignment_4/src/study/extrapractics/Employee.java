package study.extrapractics;

public class Employee {

	private int empId;
	private String empName;
	private int basicSal;
	private int HRA,PF,PT;
	private int netSal;
	private int grossSal;
	
	public Employee() {
		this.setEmpId(0);
		this.setEmpName("-");
		this.setBasicSal(0);
		this.setHRA((int)(0.5*basicSal));
		this.setPF((int)(0.12*basicSal));
		this.setPT(200);
		this.setGrossSal(basicSal+HRA);
		this.setNetSal(grossSal-(PT-PF));
	}
	public Employee(int id,String name,int bSal) {
		this.setEmpId(id);
		this.setEmpName(name);
		this.setBasicSal(bSal);
		this.setHRA((int)(0.5*basicSal));
		this.setPF((int)(0.12*basicSal));
		this.setPT(200);
		this.setGrossSal(basicSal+HRA);
		this.setNetSal(grossSal-(PT-PF));
	}
	public String toString() {
		return "EmpID:"+getEmpId()+" Emp Name:"+getEmpName()+" BSal:"+getBasicSal()+" HRA:"+getHRA()+" PF:"+getPF()+" PT:"+getPT()+" Net:"+getNetSal()+" Gross:"+getGrossSal();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}
	public int getHRA() {
		return HRA;
	}
	public void setHRA(int hRA) {
		HRA = hRA;
	}
	public int getPF() {
		return PF;
	}
	public void setPF(int pF) {
		PF = pF;
	}
	public int getPT() {
		return PT;
	}
	public void setPT(int pT) {
		PT = pT;
	}
	public int getNetSal() {
		return netSal;
	}
	public void setNetSal(int netSal) {
		this.netSal = netSal;
	}
	public int getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(int grossSal) {
		this.grossSal = grossSal;
	}
	
	
}
