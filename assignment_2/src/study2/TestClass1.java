package study2;

import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		int i;
		Scanner scn=new Scanner(System.in);
		String op="";
		String s=scn.nextLine();
		s=s.trim();
		String []sarr=s.split(" ");
		for(i=0;i<sarr.length-1;i++) {
			op+=sarr[i].substring(0,1).toUpperCase()+".";
		}
		String newstr =sarr[i].substring(0,1);
		newstr =newstr.toUpperCase() + sarr[i].substring(1);
		
		op+=newstr;
		System.out.println(op);
	}

}
/*Write a program that takes your full name as input and displays the abbreviations of 
the first and middle names except the last name which is displayed as it is.
 For example, if your name is Sneha Amod Parchure, then the output should be S.A.Parchure.
*/