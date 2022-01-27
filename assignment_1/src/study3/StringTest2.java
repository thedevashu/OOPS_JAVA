package study3;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =new String("string");
		String s2 ="string";
		System.out.println(s2.substring(5));
		if(s1 == s2) {
			System.out.println("Inside String pool");
		}
		else
			System.out.println("Not in String pool");
	}

}
