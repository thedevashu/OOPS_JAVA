package study.generic;

import study.exception.MyDate;

public class User2 {

	public static void main(String[] args) {
		GenericStack<MyDate> stk= new GenericStack<>(new MyDate[5]);
		stk.push(new MyDate(1,2,2090));
		stk.push(new MyDate(3,2,2190));
		stk.push(new MyDate(5,6,1090));
		
		stk.show();

	}

}
