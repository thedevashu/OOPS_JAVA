package study.isa;

import product.hasrelation.MyDate;

public class Product {

	private String name;
	private MyDate dom;
	private int price;
	
	public Product(String nm,MyDate mf,int pr) {
		name=nm;
		dom =mf;
		price =pr;
	}
	public Product() {
		name="";
		dom =new MyDate(1,1,2000);
		price =1;
	}
	public String showProductInfo() {
		return "Product Name:- "+name+" Date of Manf:- "+dom+" Price:- "+price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getDom() {
		return dom;
	}
	public void setDom(MyDate dom) {
		this.dom = dom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
