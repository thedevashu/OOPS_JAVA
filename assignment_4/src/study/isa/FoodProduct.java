package study.isa;

import product.hasrelation.MyDate;

public class FoodProduct extends Product{

	private MyDate date_of_Expiry;
	private String contents;
	
	public FoodProduct() {
		this.setDate_of_Expiry(new MyDate(1,1,2021));
		this.setContents("Cont");
	}
	public FoodProduct(String nm,MyDate mf,int cost,MyDate expD,String cnt) {
		super(nm,mf,cost);
		this.setDate_of_Expiry(expD);
		this.setContents(cnt);
	}
	public String showFoodProdInf() {
		return super.showProductInfo()+" Expire Date:-"+this.getDate_of_Expiry()+" Content:-"+this.getContents();

	}
	public MyDate getDate_of_Expiry() {
		return date_of_Expiry;
	}
	public void setDate_of_Expiry(MyDate date_of_Expiry) {
		this.date_of_Expiry = date_of_Expiry;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
}
