package study.extrapractics;

import java.util.Scanner;

public class CmdReplaceSpace {

	public static void main(String[] args) {
		while(true) {
			System.out.println("1. For char replace with Space\n2. For to see repeating words\n3. For deleting intput char\n 4. To EXIT");
			Scanner sc =new Scanner(System.in);
			int ch =sc.nextInt();
			if(ch >3) break;
			switch (ch) {
			case 1:
				System.out.println(replaceChar(args));
				break;
			case 2:
				System.out.println(repeatingWords(args));
				break;
			case 3:
				System.out.println(deleteChar(args));
				break;
			default:
				break;
			}
			
			
			
		}
	}

	private static String deleteChar(String[] args) {
		StringBuffer stb =new StringBuffer();
		for (int i = 0; i < args.length; i++) {
			stb.append(args[i]+" ");
		}
		System.out.println("Enter char to delete:");
		Scanner sc =new Scanner(System.in);
		char ch =sc.next().charAt(0);
		for(int j=0;j<stb.length();j++) {
			if(stb.charAt(j) == ch) {
				stb.deleteCharAt(j);
			}
		}
		
		return stb.toString();
	}

	private static String repeatingWords(String[] args) {
		String str="";
		for (int i = 0; i < args.length; i++) {
			for (int j = i+1; j < args.length; j++) {
				if(args[i].equals(args[j]))
					str+=args[i]+",";
			}
		}	
		return str;
	}

	private static String replaceChar(String[] args) {
		System.out.println("Enter Char to be replace with space");
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);
		String str="";
		int i;
		for( i=0;i<args.length-1;i++) {
			str+=args[i]+ch;
		}
		str+=args[i];
		return str;

	}

}
