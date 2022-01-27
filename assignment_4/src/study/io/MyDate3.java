package study.io;

import java.io.Serializable;

public class MyDate3 implements Comparable<MyDate3>,Serializable {

	private int day,month,year;
	public MyDate3() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public MyDate3(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate3 [" + day + "-" + month + "-" + year + "]";
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
	@Override
	public int compareTo(MyDate3 o) {
		if(this.year > o.year) return 1;
		if(this.year < o.year) return -1;
		else {
			if(this.month > o.month) return 1;
			if(this.month < o.month) return -1;
			else {
				if(this.day > o.day) return 1;
				if(this.day < o.day) return -1;
				else
					return 0;
			}
		}
		
	}
}
