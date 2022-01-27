package study.exception;

public class MyDate {
	private int day ,month,year;
	public MyDate(int d,int m,int y) {
		if(d>31 || d<1) {
			WrongDayException obj = new WrongDayException();
			throw obj;
		}
		else
			day=d;
		if(m>12 || m<1) {
			WrongMonthException obj =new WrongMonthException();
			throw obj;
		}
		else
			month =m;
		
		year =y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day+"/"+month+"/"+year;
	}
}
