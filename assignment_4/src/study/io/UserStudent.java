package study.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student stud = new Student("Student", new MyDate3(2,2,2009));
		
		//making output file stream to write on hdd
		FileOutputStream fwrite = new FileOutputStream("P:\\student.std");
		//making object output file stream
		ObjectOutputStream obj =new ObjectOutputStream(fwrite);
		obj.writeObject(stud);
		
		FileInputStream fread =new FileInputStream("P:\\student.std");
		//making Object input file stream
		ObjectInputStream OIN =new ObjectInputStream(fread);
		Object stdObj =OIN.readObject();
		
		
		System.out.println();
		//System.out.println(stdObj);

	}

}
