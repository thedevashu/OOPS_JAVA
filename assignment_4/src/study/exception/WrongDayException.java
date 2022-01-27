package study.exception;

public class WrongDayException extends RuntimeException {

	public WrongDayException() {
		System.out.println("Day should be 1-31");
	}
}
