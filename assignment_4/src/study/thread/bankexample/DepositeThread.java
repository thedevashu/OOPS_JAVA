package study.thread.bankexample;

public class DepositeThread implements Runnable {
	Account a;
	public  void run() {
		int i=0;
		while(i++<10) {
			a.deposit(1000);
			System.out.println(a);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	public DepositeThread(Account a) {
		this.a=a;
	}
	

}
