package study.practice.inheretance;

public class Main {

	public static void main(String[] args) {
		Employee m =new Manager(12,"ACB",24,"Male",1234,320020002,"Manager",20000);
		Employee d =new Dev(5000, "DEV", 23, "Male", 3001, 300321, "Developer", 30000);
		System.out.println(d);
		d.paySal();
		System.out.println(m);
		m.paySal();

	}

}
