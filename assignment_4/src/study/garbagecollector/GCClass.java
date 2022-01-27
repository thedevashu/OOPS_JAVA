package study.garbagecollector;

public class GCClass {

	public static void main(String[] args) {
//		BigClass b[] =new BigClass[100000];
		for (int i = 0; i < 100; i++) {
			BigClass b=new BigClass();
			System.out.println(i);
			System.gc();
		}

	}

}
class BigClass{
	long l[] =new long[10000];
	@Override
	public void finalize() throws Throwable {
		System.out.println("GC :"+this);
	}
}
