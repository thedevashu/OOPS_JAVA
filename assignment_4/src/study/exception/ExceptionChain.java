package study.exception;

import java.util.Scanner;

public class ExceptionChain {

	public static void main(String[] args) {
		
		try {
			manager();
			
		} catch (Exception e) {
			System.out.println("ENTER NUMBER:");
			main(args);
		}

	}
	private static void manager() throws NumberFormatException {
		suprviser();
		
	}
	private static void suprviser ()throws NumberFormatException   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		int x=Integer.parseInt(s);
		System.out.println(x);

	}

}
