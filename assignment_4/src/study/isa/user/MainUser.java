package study.isa.user;

import product.hasrelation.MyDate;
import study.isa.ElectronicProduct;
import study.isa.FoodProduct;

public class MainUser {

	public static void main(String[] args) {
		FoodProduct fp =new FoodProduct();//making object of foodproduct
		//setting value through setters 
		fp.setName("Coco ");
		fp.setContents("Milk,Coco,Sweet ");
		fp.setDate_of_Expiry(new MyDate(1,1,2022));
		fp.setPrice(100);
		fp.setDom(new MyDate(1,1,2019));
		System.out.println(fp.showFoodProdInf());
		
		//calling parameterize constructor
		FoodProduct fp1 =new FoodProduct("Butter",new MyDate(1,1,2020),1000,new MyDate(1,1,2024),"Milk,Fat,Protien");
		System.out.println(fp1.showFoodProdInf());
		
		//calling Electronics product
		
		ElectronicProduct ep =new ElectronicProduct("Mobile",new MyDate(1,1,2021),10000,2,"RAM:2GB,ROM:64GB,Version:2.0.1.12");
		System.out.println(ep.showEProdInfo());
	}

}
