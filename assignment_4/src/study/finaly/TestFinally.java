package study.finaly;

import java.io.IOException;

public class TestFinally {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			throw new IOException();
		}
		catch (IOException e) {
			System.out.println("2");
			e.printStackTrace();
		}
		finally {
			System.out.println("3");
		}
//		try {
//			System.out.println("1");
//			throw new ArithmeticException();
//		} catch (ArithmeticException e) {
//			System.out.println("2");
//		}
//		finally {
//			System.out.println("3");
//		}
//		System.out.println("4");

	}

}
