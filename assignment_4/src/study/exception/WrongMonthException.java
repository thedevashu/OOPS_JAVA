package study.exception;

public class WrongMonthException extends RuntimeException {
	public WrongMonthException() {
		System.out.println("Month should be between 1-12");
	}
}
