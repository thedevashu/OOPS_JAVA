package study.abstractkey;

public class User {

	public static void main(String[] args) {
		Product[] cart = new Product[4];
		cart[0] = new Toy("doll", "non-battery", 300);
		cart[1] = new Toy("car" ,"battery" ,200);
		cart[2] = new Dress("sherwani","blue","L", 2000);
		cart[3] =new Dress("Kurta","White","XL",1200);

		showBill(cart);
	}

	private static void showBill(Product[] cart) {
		double totalBill=0;
		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i].getDesc() +" Bill: "+cart[i].getFinalCost());
			totalBill+=cart[i].getFinalCost();
		}		
		System.out.println("\nTOTAL BILL IS:"+totalBill);
	}

}//end Product class
