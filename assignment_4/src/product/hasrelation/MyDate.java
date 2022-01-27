package product.hasrelation;

public class MyDate {
	private short day;
	private short month;
	private int year;
	
	public MyDate() {
		this.setDay(1);
		this.setMonth(1);
		this.setYear(2000);
	}
	public MyDate(int day,int month,int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	public short getDay() {
		return day;
	}

	public void setDay(int i) {
		this.day = (short) i;
	}

	public short getMonth() {
		return month;
	}

	public void setMonth(int i) {
		this.month = (short) i;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
