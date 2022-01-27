package study.practice.daemonthread;

public class TimeWatcher implements Runnable {

	@Override
	public void run() {
		int i=0;
		while(i++<10) {
			System.out.println("Tell me time");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
