package study;

import java.util.Scanner;

public class StringMenu {

	public static void main(String[] args) {
		System.out.println("WELCOME Enter your String");
		Scanner scn =new Scanner(System.in);
		String str =scn.nextLine();
		
		while(true) {
			menuOption();
			int ip =scn.nextInt();
			if(ip == 4)		break;
			switch (ip) {
			case 1:
				System.out.println("Length of "+str+" is: "+str.length());
				break;
				
			case 2:{
				
				int b,e;
				System.out.println("Enter begin and end index");
				b=scn.nextInt();
				e=scn.nextInt();
				System.out.println(str.substring(b, e));
				break;
			}
			
			case 3:{
				char carr[] = str.toCharArray();
				char rcarr[] = new char[carr.length];
				for(int i=carr.length-1, j=0;i>=0;i--,j++) {
					rcarr[j]=carr[i];
				}
				String revString = String.valueOf(rcarr);
				if(str.equals(revString)) {
					System.out.println(str+" is palindrom");
				}
				else
					System.out.println(str +" is not palindrom"+revString);
				break;
			}
				

			default:
				break;
			} 
			
		}
	}

	private static void menuOption() {
		System.out.println("1. Show length of string\r\n" + 
				"2. Show substring \r\n" + 
				"3. Check if string is palindrome \r\n" + 
				"4. quit ");
		
	}
}
/*1. Accept a string from the user 
		a. Show a menu ( switch -case) - show this in a loop
			1. Show length of string ( hint = use API  length() )
			2. Show substring- accept begin and end index from user  ( hint = use API substring )
			3. Check if string is palindrome (  hint = use API  length(), charAt, concat or +, equals  
			4. quit
			
*/