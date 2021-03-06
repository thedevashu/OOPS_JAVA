package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Accepting input from user to cities.txt
		try {
			FileOutputStream fwrite = new FileOutputStream("P:\\cities.txt",true);
			PrintWriter pw =new PrintWriter(fwrite);
			Scanner sc =new Scanner(System.in);
			
			while(true) {
				System.out.println("Enter city name or Quit to exit!");
				String str =sc.nextLine();
				
				//break if quit entered
				if(str.equalsIgnoreCase("quit"))	break;
				
				pw.write(str.toLowerCase()+"\n");
				pw.flush();
				
			}//while end
			pw.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//reading file cities.txt
		try {
			FileInputStream fread =new FileInputStream("P:\\cities.txt");
			Scanner scn =new Scanner(fread);
			//cities print on console from .txt file
//			while(scn.hasNext())
//				System.out.println(scn.next());
//			
			//Making arrayList
//			again initialize scn because it is itreated till end in above while loop
			
			ArrayList<String> arrList =new ArrayList<>();
			while(scn.hasNext()) {
				String cityName =scn.next();
//				System.out.println("------\n"+scn.next());
				arrList.add(cityName);
			}
			//city name
			System.out.println(arrList);
			//count of cities
			int count =arrList.size();
			
			System.out.println(count);
			
			//sort by name
			Stream stm = arrList.stream();
			stm.sorted().forEach((e)->{System.out.println(e);});
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main ends

}
/*1. Write a program to accept names of cities from user till user says quit 
		Append the name in a text file cities.txt
	2. Write a program to read all names from the cities.txt
		a. Show the count of cities
		b. Show all cities in sorted order !!!  Use ArrayList + Collections.sort   OR  use TreeSet 
	3. Write a class Book in study.io
		a. Name, author name, cost, date of publication --- MyDate3
	4. Write a class SerializeBook
		a. Main
			i. Create 5 Book objects and write them to a file  books.bingo
	5. Write a class DeserializeBook
		a. Main
			i. Read all books from books.bingo and show name and cost of each book also show publication year
*/