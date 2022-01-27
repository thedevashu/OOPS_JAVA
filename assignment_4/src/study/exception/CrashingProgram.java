package study.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrashingProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divident = 0,divisor,division = 0;
		try {
		System.out.println("enter divident");
		divident = sc.nextInt();
		
		System.out.println("enter divisor");
		divisor = sc.nextInt();
		division = divident/divisor;
		
		
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			division =divident;
		}
		
		System.out.println("LAST LINE  division ="+division);

	}

}
