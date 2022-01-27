package study.exception;

import java.io.IOException;
import java.nio.channels.AlreadyBoundException;
import java.util.InputMismatchException;

import org.omg.CORBA.UserException;

public class ExampleOfThrow {

	public static void main(String[] args) {
		try {
			f1(101);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		MyDate d=new MyDate(1, 12, 1990);
//		System.out.println(d);
	}

	private static void f1(int i) throws IOException {
		if(i>100) {
//			InputMismatchException obj =new InputMismatchException("-bitttttttttttvj");
//			AlreadyBoundException obj =new AlreadyBoundException();
			throw new IOException();
			
			
			
//			throw obj;//unchecked error because it in runtime class hirarcey
		}
		else 
			System.out.println("--"+i);
		
	}

}
