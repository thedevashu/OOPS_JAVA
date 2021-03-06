package study.thread;

public class ThreadExample {

	
	public static void main(String[] args) {
		Thread th = new Thread1();
		Thread th2 =new Thread2();
		
		th.start();
		th2.start();     
		
	}
	
	
}
class Thread1  extends Thread{
	 @Override
	public void run() {
		//square till 50
		 int i=1;
		 while(i++<50) {
			 System.out.println(i+"->"+i*i);
			 try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}//thread1 end

class Thread2 extends Thread{
	@Override
	public void run() {
		//fatorial till 15
		
		for (int i = 1; i <= 15; i++) {
			int fact=1;
			for (int j = 1; j <= i; j++) {
				fact*=j;
			}
			System.out.println(i+"!= "+fact);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}//thread2 end
/*1. Write 2 threads using extends Thread 
		a. Thread1   calculates the square of each number starting from 1 ,  displays the square and sleeps for 2sec it continues till 50
		b. Thread 2 calculates the factorial of of each number starting from 1 ,  displays the square and sleeps for 2sec it continues till 15
	Create threads in main, give name to each thread print the name 
	*/