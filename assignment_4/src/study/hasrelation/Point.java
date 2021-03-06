package study.hasrelation;

public class Point {

	private int x,y;
	public Point() {
		setX(0);
		setY(0);
	}
	
	public Point(int x,int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
	
}
