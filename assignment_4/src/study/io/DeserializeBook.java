package study.io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeBook {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Creating intput stream to read books.bingo object file to read
		FileInputStream fread = new FileInputStream("P:\\books.bingo");
		
		ObjectInputStream OIS =new ObjectInputStream(fread);//object input stream
		//convert ObjectInputStream to object first to read
		Object obj = OIS.readObject();
		
		System.out.println(obj);
	
		
		System.out.println(OIS);//hash value of obj-ip-stream

	}

}
