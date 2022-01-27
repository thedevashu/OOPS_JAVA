package study.practice;

public class MyDate {
	private int day,month,year;
	public MyDate(int dy,int mnt,int yr) {
		day =dy;
		month=mnt;
		year=yr;
	}
	@Override
	public boolean equals(Object obj) {
		MyDate temp =(MyDate)obj;
		
		if(day == temp.day && month == temp.month && year == temp.year) return true;
		else return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day+"/"+month+"/"+year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
