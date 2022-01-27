package study.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StringIOFile {

	public static void main(String[] args) throws Exception {
		//Making file output stream
		FileOutputStream fwrite =new FileOutputStream("P:\\msg.txt");
		Scanner scn =new Scanner(System.in);
		
		//Writing line in file
		PrintWriter pw= new PrintWriter(fwrite);
		System.out.println("Enter your line");
		pw.println(scn.nextLine());
		pw.flush();
		pw.close();
		//Makin input Stream
		FileInputStream fread =new FileInputStream("P:\\msg.txt");
		
		
		Scanner sc =new Scanner(fread);
		
		Stack<String> stk =new Stack<>();
//		Collection<String> stk= new Stack<>();
		while(sc.hasNext()) {
			stk.add(sc.next());
		}
		while(!stk.isEmpty())
			System.out.println(stk.pop());
//		Iterator< String> it =stk.iterator();
//		System.out.println(it.next());

	}

}
