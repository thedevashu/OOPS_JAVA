package study.practice;

import java.io.Serializable;

public class Product implements Serializable{

	private String productName;
	private String dec;
	 double cost;
	private String brand;
	
	public Product(String productName,String dec,double cost,String brand) {

		this.productName =productName;
		this.dec =dec;
		this.cost =cost;
		this.brand =brand;
	}
	
	public String toString() {
		return "Product Name="+productName+", description="+dec+", cost="+cost+", Brand="+brand;
	}
	
	
}
/*Write a class Product ( properties productname, cost, desc , brand )

Create Array of 5 Products
Serialize each Product in the Array
Write another class and DeSerialize the file having product objects
Show the total of all products after deserialization
*/