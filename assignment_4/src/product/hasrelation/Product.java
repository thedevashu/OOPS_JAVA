package product.hasrelation;

public class Product {
	private String productName;
	private String desc;
	private int cost;
	private MyDate expDate;
	
	public Product() {
		setProductName("");
		setDesc("");
		setCost(0);
		setExpDate(new MyDate());
		
	}
	public Product(String pName,String des,int cost,MyDate expDate) {
		this.setProductName(pName);
		this.setDesc(des);
		this.setCost(cost);
		this.setExpDate(expDate);
	}
	
	public String toString() {
		return productName+"-"+desc+"-"+cost+"-"+expDate;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public MyDate getExpDate() {
		return expDate;
	}

	public void setExpDate(MyDate expDate) {
		this.expDate = expDate;
	}
	
}
/*Write a class Product  
			Properties -  productName, desc, cost , dateOfExpiry
			Write a class MyDate  --- properties  day , month, year 
			
			UserOfProduct
				Create array of Products --- populate array ( either hardcode OR  accept values from user )
				
				Ask the user which product she wants to purchase and quantity 
					Check if product is within expiry date 
						If yes then  ----  calculate the total cost ==  qty * product cost 
						Show bill
							Product name desc    qty    cost   total cost 
							
					Else
					    product has crossed expiry date , we cannot sell it 
*/