package user.java;

import study.extrapractics.Child;
import study.extrapractics.Parent;

public class Main {

	public static void main(String[] args) {
		Parent p = new Child(2,3);
		((Child)p).showXY();
		

	}

}
