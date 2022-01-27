package study.exception;

public class TestCommandLine {

	public static void main(String[] args) {
		try {
		String str =args[0].toUpperCase();
		System.out.println(str);
		try {
		int i =Integer.parseInt(args[1]);
		int sqr =i*i;
		System.out.println(sqr);
		}
		catch (NumberFormatException e) {
			System.out.println("Enter number not string ");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ENTER 2 COMMAND LINE ARGS");
		}
	}

}
