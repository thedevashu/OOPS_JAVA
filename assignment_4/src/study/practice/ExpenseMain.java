package study.practice;

public class ExpenseMain {

	public static void main(String[] args) {
		ExpenseDetails exp1 =new ExpenseDetails("High", 20000, new MyDate(12, 23, 2009)); 
		ExpenseDetails exp2 =new ExpenseDetails("High", 20000, new MyDate(12, 23, 2009)); 
		ExpenseDetails exp3 =new ExpenseDetails("low", 5000, new MyDate(12, 23, 2009)); 
		
		System.out.println((exp1.equals(exp3)));
	}//main end
	

}
