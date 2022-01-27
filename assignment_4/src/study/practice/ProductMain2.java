package study.practice;

public class ProductMain2 {

	public static void main(String[] args) {
		ProductMain.serializeArr();
		Product []prr =ProductDeserialize.deserializeProduct();
		double total=0;
		for(Product s :prr) {
			total+=s.cost;
			System.out.println(s);
		}
		System.out.println("Total cost="+total);
	}

}
