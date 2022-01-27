package study.abstractkey;

public abstract class Product {
	public abstract String getDesc();
	public abstract double getFinalCost();
}//end Prouct class

class Toy extends Product{
	private String name, category ;
	private double cost;
	public Toy(String name, String category, double cost) {
		super();
		this.name = name;
		this.category = category;
		this.cost = cost;
	}

	
	
	
	public Toy() {
		setName("");
		setCategory("");
		setCost(0);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}




	@Override
	public String getDesc() {
		String str="Name of Toy: "+getName() +" Battry Category: "+getCategory();
		
		return str;
	}




	@Override
	public double getFinalCost() {
		double fcost = this.getCost()-(this.getCost()*0.1);
		return fcost;
	}
}//end Toy class

class Dress extends Product{
	
//	defalut constructor
	public Dress() {
		this.name = "";
		this.material = "";
		this.size = "";
		this.price = 0;
	}
	//constructor with para
	public Dress(String name, String material, String size, double price) {
		
		this.name = name;
		this.material = material;
		this.size = size;
		this.price = price;
	}
	private String name, material ,size ;
	private double price;
	
	
	
	//getter setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String getDesc() {
		String str ="Dress :"+this.name+" Material: "+this.material+" Size: "+this.size;
		return str;
		
	}
	@Override
	public double getFinalCost() {
		double gst=0.18;
		double dis=0.20;
		
		return (this.price+(this.price*gst))-this.price*dis;
	}
	
}//end Dress class




