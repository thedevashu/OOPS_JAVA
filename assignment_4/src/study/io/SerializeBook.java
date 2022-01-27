package study.io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import study.collection.MyDate3;

public class SerializeBook {

	public static void main(String[] args) {
		List<Book> bl= new ArrayList<Book>();
		bl.add(new Book("Cosmos", "Reegle", 150, new MyDate3(2, 3, 2001)));
		bl.add(new Book("College", "Book", 250, new MyDate3(7, 6, 2012)));
		bl.add(new Book("Industries", "A4", 80, new MyDate3(2, 8, 2018)));
		bl.add(new Book("Vitaos", "Bourn", 97, new MyDate3(15, 3, 2004)));
		
		System.out.println(bl);
		
		try {
			//making output stream to save data in hdd
			FileOutputStream fwrite =new FileOutputStream("P:\\books.bingo");
			
			try {
				 
				ObjectOutputStream OOS =new ObjectOutputStream(fwrite);
				OOS.writeObject(bl);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
