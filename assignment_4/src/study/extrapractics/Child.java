package study.extrapractics;

public class Child extends Parent{
	private int y;
	public Child() {
		y=0;
	}
	public Child(int x,int y) {
		super(x);
		this.y=y;
	}
	public void showXY() {
		super.showX();
		System.out.println("Y="+y);
	}

}
