package study.hasrelation;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		Point center = new Point(1,2);
		Circle c =new Circle(12.33,center);
		Circle []arr =new Circle[3];
		Scanner scn =new Scanner(System.in);
		double rad =12.23;
		for(int i=0;i<arr.length;i++) {
			System.out.println("ENter x and y for center");
			int x=scn.nextInt();
			int y=scn.nextInt();
			arr[i] =new Circle(rad++,new Point(x,y));
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getCenter().getY());
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getCenter().getY() >= 10 && arr[i].getCenter().getY() <=20) {
				System.out.println(arr[i]);
			}
		}
		
//		System.out.println("Radius = "+c.getRadius()+" center("+ c.getCenter().getX()+","+c.getCenter().getY()+")");
//		System.out.println(c);
	}

}
/*1. Write the Circle and Point example done in class .  Populate the array from user.
		1. Show only radius of all circles in the array 
		2. Show the centers and radii of all circles whose y coordinate is between 10 and 90
		3. Show only y coordinates of all circles*/