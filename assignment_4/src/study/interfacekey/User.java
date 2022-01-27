package study.interfacekey;

public class User {

	public static void main(String[] args) {
		Sellable pd1 =new CD("GANA","Video","k.k me",150.00,5.30,10);
		System.out.println(pd1);
		pd1 =new Laptop("DELL", "16GB", "2TB", "i5", 50000);
		pd1.setDiscount(10);
		System.out.println(pd1);

		Sellable pd2 =new CD("SONG", "Music", "A.S", 899, 4.21, 12);
		System.out.println(pd2);
	}

}
