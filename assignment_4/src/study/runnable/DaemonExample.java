package study.runnable;

public class DaemonExample {
	public static void main(String[] args) {
		Thread th=new Thread(new CompanyNeedChai());
		Thread th2 =new Thread(new TapriWala());
		th2.setDaemon(true);
		th.start();
		th2.start();
	}

}
class CompanyNeedChai implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i++ <10) {
			System.out.println("WE consume chai");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("We Dont need chai now");
		
	}
	
}

class TapriWala implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("I GIVE CHAI UNTIL U ARE WORKING");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
