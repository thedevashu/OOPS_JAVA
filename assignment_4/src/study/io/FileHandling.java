package study.io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f =new FileOutputStream("P:\\abc.txt",true);
		
		PrintWriter pw =new PrintWriter(f);
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("ENter city name");
			String str =sc.nextLine();
			if(str.equalsIgnoreCase("quit"))	break;
			pw.write(str+"\n");
			pw.flush();
		}
		pw.close();
		
		FileInputStream fin =new FileInputStream("P:\\abc.txt");
		Scanner scn =new Scanner(fin);
		while(scn.hasNext())
			System.out.println(scn.next());

	}

}
