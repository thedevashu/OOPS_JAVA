package study.hasrelation;

public class Circle {
	private double radius;
	private Point center;
	
	public Circle(){
		setRadius(1);
		setCenter(new Point());
	}
	public Circle(double radius,Point center){
		setRadius(radius);
		setCenter(center);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle c =(Circle)obj;
			return this.radius == c.radius;
					}
		else 
			return false;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	public String toString() {
		return "Radius = "+getRadius()+ ",Center "+center;
	}

}
