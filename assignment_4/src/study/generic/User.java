package study.generic;

public class User {

	public static void main(String[] args) {
		GenericStack<Integer> s =new GenericStack<>(new Integer[3]);
		s.push(23);
//		s.push("o");
//		s.push(97);
		s.push(12);
		//s.push("m");
		s.show();
		while(true) {
			try {
			int x=(Integer)s.pop();
			System.out.println(x*x);
			}
			catch (NullPointerException e) {
				break;
			}
		}

	}

}
