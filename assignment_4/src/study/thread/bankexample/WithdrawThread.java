package study.thread.bankexample;

public class WithdrawThread implements Runnable {
	Account ac;
	public WithdrawThread(Account a) {
		ac=a;
	}
	@Override
	public  void run() {
		for (int i = 0; i < 10; i++) {
			
				ac.withdraw(100);
			
			System.out.println(ac);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}
