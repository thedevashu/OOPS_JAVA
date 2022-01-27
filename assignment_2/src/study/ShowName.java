package study;

import java.util.Scanner;

public class ShowName {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter a name");
			Scanner sc =new Scanner(System.in);
			String str =sc.nextLine();
			if(str.equalsIgnoreCase("quit"))	break;			
			String s[]= str.split(" ");
			String p1 =s[0].substring(0,1).toUpperCase();
			String p2 =s[0].substring(1).toLowerCase();
			String p3 =s[1].substring(0,1).toUpperCase();
			String p4 =s[1].substring(1).toLowerCase();
			
			System.out.println(p1+p2+" "+p3+p4);
			
		}

	}

}
/* create a loop that accepts a name ( firstname surname)  from the user and prints 
		Welcome  name in title case  
			User enters   sachiN tenDulkar   ( use API  = split(), substring, toUppercase, toLowercase  )
			Output   ---------                Welcome Sachin Tendulkar
			
		The loop shall continue till user enters quit/ Quit/qUIT /QUIT/quiT  ( Use API = equalsIgnoreCase )*/