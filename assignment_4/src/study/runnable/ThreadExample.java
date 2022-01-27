package study.runnable;

public class ThreadExample {

	public static void main(String[] args) {
//		TT t1 =new TT();
//		TT t2 =new TT();
//		Thread.currentThread().setName("HELLO");
//		t1.run();
//		t2.run();
		
		Thread t1 =new Thread(new TT());
		Thread t2 =new Thread(new TT());
		int a=1,b=9;
		System.out.println("d"+a+b);
		t1.setName("Hello");
		t2.setName("HI");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}//ThreadExample end

class TT implements Runnable
{

	@Override
	public void run() {
		while(true) {
		System.out.println("SAY "+ Thread.currentThread().getName() +" PRoiroty: "+Thread.currentThread().getPriority());
	
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}
		
	}
	
}
