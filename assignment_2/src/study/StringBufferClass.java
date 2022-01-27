package study;

import java.util.Scanner;

public class StringBufferClass {

	public static void main(String[] args) {
		System.out.println("Entert a String");
		Scanner scn =new Scanner(System.in);
		String str = scn.nextLine();
		StringBuffer strb = new StringBuffer(str);
		strb.reverse();
		if(strb.toString().equals(str)) {
			System.out.println(str + " is PALINDROM");
		}
		else
			System.out.println(str + " is not PALINDROM "+strb);
	}

}
/*Accept a string from the user .
	Use StringBuffer class API    reverse ()  , equals     to show whether the string is a palindrome .*/