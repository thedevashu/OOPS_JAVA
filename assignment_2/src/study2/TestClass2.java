package study2;

import java.util.Scanner;
import java.util.Stack;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		int count=1;
		Scanner scn =new Scanner(System.in);
		String str =scn.nextLine();
		char []cnt =str.toCharArray();
		Stack stk =new Stack();
		
		for(int i=0;i<str.length();i++) {
			stk.push(cnt[i]);
		}
		System.out.println(stk);
		
		for (int i = str.length()-1; i >=0 ; i--) {
			if(stk.isEmpty())	break;
			char c =(char) stk.pop();
			if(c==cnt[i]) {
				
				System.out.println(c);
				
			}
		}
		System.out.println(stk);
		
 //		String str ="repate";  aassdd
//		char ch[] =str.toCharArray();
//		int []cnt =new int[ch.length];
//		int i,j;
//		for( i =0;i<ch.length;i++) {
//			
//			for( j=i+1;j<ch.length;j++) {
//				
//				if(ch[i]==ch[j]) {
//					count++;
//					cnt[i]=count;
//					
//				}
//				
//			}
//			
//			
//			
//			count =1;
//		}
		
		
//		for(int n:cnt) {
//			System.out.println(n);
//		}
		
	}

}
/*
Q2.Input a string of alphabets. Find out the number of occurrence of all alphabets in that string.
 Find out the alphabet with maximum occurrence.
 */