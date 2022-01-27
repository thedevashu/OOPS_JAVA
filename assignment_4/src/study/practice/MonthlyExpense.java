package study.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class MonthlyExpense {
	private ArrayList<ExpenseDetails> arrList;
	public MonthlyExpense() {
		this.arrList =new ArrayList<>();
	}//end MonthlyExpense constructor

	public void addNewExpens(ExpenseDetails e) throws NotCurrentMonthException {
//		GregorianCalendar g =;
		Calendar g =new GregorianCalendar();
		
		if(e.getExpenseDate().getMonth() == (g.get(Calendar.MONTH)+1)) {
			arrList.add(e);
		}
		else {
			throw new NotCurrentMonthException();
		}
	}//end addNewExpense
	
	public void showAll() {
		System.out.println(arrList);

	}//end of showAll
	public double getTotalExpenditur() {
		double totalMonthExpense=0;
		
		Iterator<ExpenseDetails> it =arrList.iterator();
		while(it.hasNext()) {
			totalMonthExpense+=it.next().getExpenseAmount();
		}
		return totalMonthExpense;
		

	}//end of getTotalExpenditure()

}//end class
