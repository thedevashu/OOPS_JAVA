package que1;

import java.util.Scanner;

public class MyWrapper {

	public static void main(String[] args) {
		int loop=5;
		Scanner scn =new Scanner(System.in);
		while(loop-- > 0) {
			System.out.println("Enter your password");
			String pwd =scn.nextLine();
			if(verify(pwd))	{
			System.out.println("Action Complete");	
			break;
			}
			else {
				System.out.println("Try again Chance left:"+loop);
			}
		}
		System.out.println("SORRY ALL CHANCES OVER");
	}

	private static boolean verify(String pwd) {
		
		boolean len=lengthCheck(pwd);
		boolean begin =beginCheck(pwd);
		boolean capital =upperCaseCheck(pwd);
		boolean digit =digitCheck(pwd);
		boolean smallCase =smallCaseCheck(pwd);
		boolean specialChar =specialCHarCheck(pwd);
		if(len && begin && capital && digit && smallCase && specialChar) {
			return true;
		}
		return false;
	}

	private static boolean specialCHarCheck(String pwd) {
		for(int i=0;i<pwd.length();i++) {
			char ch =pwd.charAt(i);
			if(ch == '-' || ch == '_' || ch == '#' || ch == '$') {
				return true;
			}
		}
		System.out.println("The password must have at least one special char(_-#$)");
		return false;
	}

	private static boolean smallCaseCheck(String pwd) {
		for(int i=0;i<pwd.length();i++) {
			if(Character.isLowerCase(pwd.charAt(i))) {
				return true;
			}
		}
		System.out.println("The password must have at least one small character");
		return false;
	}

	private static boolean digitCheck(String pwd) {
		for(int i=0;i<pwd.length();i++) {
			if(Character.isDigit(pwd.charAt(i))) {
				return true;
			}
		}
		System.out.println("The password must have at least one digit");
		return false;
	}

	private static boolean upperCaseCheck(String pwd) {
		
		for(int i=0;i<pwd.length();i++) {
			if(Character.isUpperCase(pwd.charAt(i))) {
				return true;
			}
		}
		System.out.println("The password must have at least one capital character");
		return false;
	}

	private static boolean beginCheck(String pwd) {
		char c =pwd.charAt(0);
		if(Character.isLetter(c)) {
			return true;
		}
		else
			System.out.println("The password must begin with a letter");
		return false;
	}

	private static boolean lengthCheck(String pwd) {
		if(pwd.length()>=8 && pwd.length() <= 20) {
			return true;
		}
		System.out.println("The password length must be between 8 and 20");
		return false;
	}

}
/*1.	 Write a class WrapperExample
		a. Write a main method  ----  accept a new password from user
						     pass that password to a verify(pwd)  , this method returns a boolean
							If password is valid then returned value is true  , else false
						     check if password is valid , if yes then say congratulations your password is set
							Else ask the user to reenter ---Loop for 5 times in case of invalid pwd
							
		b. Write a method     boolean  verify(String p )  ( use charAt, length API of String class  , use Character.isDigit, isLetter,isUpperCase,isLowerCase,……..   )
					Return true only if password satisfies the following condition , else return false
					1. The password length must be between 8 and 20
					2. The password must begin with a letter 
					3. The password must have at least one capital character
					4. The password must have at least one digit 
					5. The password must have at least one small character
					6. The password must have at least one special char ====>>>       _   -  #  $
				
*/