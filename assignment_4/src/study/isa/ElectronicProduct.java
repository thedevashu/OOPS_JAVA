package study.isa;

import product.hasrelation.MyDate;

public class ElectronicProduct extends Product{

	private float warrantyPeriod;
	private String specifications;
	
	public ElectronicProduct() {
		this.setWarrantyPeriod(1f);
		this.setSpecifications("Electronic");
	}
	public ElectronicProduct(String nm,MyDate mf,int cost,float wp,String spec) {
		super(nm,mf,cost);
		this.setWarrantyPeriod(wp);
		this.setSpecifications(spec);
	}
	
	public String showEProdInfo() {
		return super.showProductInfo()+" Warranty Period:- "+this.warrantyPeriod+" Spec:- "+this.specifications;
	}
	public float getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setWarrantyPeriod(float warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	
	
	

}
