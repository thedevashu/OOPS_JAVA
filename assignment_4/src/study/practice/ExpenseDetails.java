package study.practice;

public class ExpenseDetails {
	 String expenseDescription ;
	 double expenseAmount ;
	 MyDate expenseDate;
	/**
	 * @param expenseDescription
	 * @param expenseAmount
	 * @param expenseDate
	 */
	public ExpenseDetails(String expenseDescription, double expenseAmount, MyDate expenseDate) {
		super();
		this.expenseDescription = expenseDescription;
		this.expenseAmount = expenseAmount;
		this.expenseDate = expenseDate;
	}
	public String getExpenseDescription() {
		return expenseDescription;
	}
	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}
	public double getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public MyDate getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(MyDate expenseDate) {
		this.expenseDate = expenseDate;
	}
	@Override
	public String toString() {
		return "ExpenseDetails [expenseDescription=" + expenseDescription + ", ExpenseAmount=" + expenseAmount
				+ ", expenseDate=" + expenseDate + "]\n";
	}
	
//	@Override
	public boolean equals(Object obj) {
		ExpenseDetails temp = (ExpenseDetails)obj;
		if(this.expenseDescription.equals(temp.expenseDescription) && this.expenseAmount == temp.expenseAmount && this.expenseDate.equals(temp.expenseDate))
		return true;
		
		else return false;
	}
	 
	 
	
}
