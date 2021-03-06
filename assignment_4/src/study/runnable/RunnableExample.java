package study.runnable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class RunnableExample {

	public static void main(String[] args) {
		Thread r1 =new Thread(new Thread1()) ;
		r1.start();
		Thread r2 =new Thread(new Thread2());
		r2.start();
		System.out.println("MAIN SAYS GOOD BYEE");

	}

}
class Thread1 implements Runnable{

	@Override
	public void run() {
		//Making output stream to write table till 50 on hdd
		try {
			FileOutputStream fwrite = new FileOutputStream("P:\\tables.txt");
			PrintWriter pw =new PrintWriter(fwrite);
			int i=1;
			while(i++ < 50) {
				for(int j=1;j<=10;j++) {
					String k = Integer.toString(i)+" x "+Integer.toString(j)+" = "+Integer.toString(i*j);
				pw.write(k+"\n");
				pw.println(i+" -X- "+j+" = "+i*j);
				}
				pw.flush();
			}
			 int n=1;
			 while(n++<50) {
				 String sq = Integer.toString(n) +"->" +Integer.toString(n*n)+"->";
				 System.out.print(sq);
				 try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 pw.write(sq+"\n");
			 }
				
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}//thread1 end

class Thread2 implements Runnable{

	@Override
	public void run() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		for(int l =0; l<5;l++) {
			
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println("");
				
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//run end
	
}
/*Write 2 threads using Runnable
		a. Thread1  prints the table of  each number starting from 1 ,  displays the square and sleeps for 2sec it continues till 50   in  file tables.txt ( PrintWriter )
		b. Thread 2 accepts a number from the user and shows the star triangle
			User enters 3 
			1
			1 2
			1 2 3
	         do this for  5 times .
		Give a name to each thread and print it*/