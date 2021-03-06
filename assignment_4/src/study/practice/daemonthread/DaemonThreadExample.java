package study.practice.daemonthread;

import java.util.Date;

public class DaemonThreadExample {

	public static void main(String[] args) {
		//nonserivec class
		Thread tw =new Thread(new TimeWatcher());
		tw.start();
		//service class
		Thread tt =new Thread(new TimeTeller());
		tt.setDaemon(true);
		tt.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main ENd "+Thread.currentThread().getName());
	
		



	}

}

class TimeTeller implements Runnable{

	@Override

	public void run() {
		while(true) {
			Date d =new Date();
			System.out.println(d.toGMTString());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



	}

}
