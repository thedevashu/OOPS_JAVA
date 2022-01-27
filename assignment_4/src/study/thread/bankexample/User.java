package study.thread.bankexample;

public class User {
	public static void main(String[] args) {
		Account shared = new Account();
		Thread deposit = new Thread(new DepositeThread(shared));
		Thread withdraw = new Thread(new WithdrawThread(shared));
		
		deposit.start();
		withdraw.start();
		
		System.out.println("main ends ..");
		
	}//main ends

}
