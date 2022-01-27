package study.practice;

public class MonthlyExpenseUser {

	public static void main(String[] args) {
		MonthlyExpense m =new MonthlyExpense();
		try {
		
		m.addNewExpens(new ExpenseDetails("ABCD", 200, new MyDate(10, 11, 2021)));
		m.addNewExpens(new ExpenseDetails("EFGH", 399, new MyDate(12, 11, 2021)));
		m.addNewExpens(new ExpenseDetails("IJKL", 599, new MyDate(16, 11, 2021)));
		m.addNewExpens(new ExpenseDetails("MNOP", 349, new MyDate(19, 11, 2021)));
		m.addNewExpens(new ExpenseDetails("QRST", 789.788, new MyDate(11, 11, 2021)));
		
		
		System.out.println("Total Monthly expense is :"+m.getTotalExpenditur());
		}
		catch (Exception e) {
			System.out.println("Enter current month");
			e.printStackTrace();
		}
		finally {
			m.showAll();
		}
	}

}
