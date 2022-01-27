package study.polymorphism;

public interface IWork {
	public void work();
	default void takeOff() {
		System.out.println("PAID LEAVE");
	}
	
}
interface IPlay{
	public void play();
	default void takeOff(int i) {
		System.out.println("REST");
	}
}

class ME implements IWork,IPlay{

	@Override
	public void work() {
		System.out.println("I AM WORKING");
		
	}

//	@Override
//	public void takeOff() {
//		// TODO Auto-generated method stub
//		System.out.println("i go");
//	}

	@Override
	public void play() {
		System.out.println("I PLAY");
		
	}
	
}
