package study.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LoginMashMap {

	public static void main(String[] args) {

		HashMap<String, String> uid =new HashMap<>();
		uid.put("User1","pass1");
		uid.put("User2","pass2" );
		uid.put("User3","pass3" );
		uid.put("User4","pass4");

		System.out.println(uid);
		Scanner sc = new Scanner(System.in);

		login(uid,sc);
		changePassword(uid,sc);
		System.out.println(uid);
		//		HashSet<String> loginDetail =new HashSet<>();
		//		loginDetail.add("name1");
		//		loginDetail.add("name12");
		//		loginDetail.add("name13");
		//		loginDetail.add("name15");
		//		System.out.println(loginDetail);


	}

	private static void changePassword(HashMap<String, String> uid, Scanner sc) {
		System.out.println("Enter Username to change password");
		String uname=sc.next();
		System.out.println("Enter new Password");
		uid.replace(uname, sc.next());
		
		
	}

	private static void login(HashMap<String, String> uid, Scanner sc) {
		System.out.println("Enter User Name");

		if(!uid.containsKey(sc.next())) {
			System.out.println("Wrong User");
			return;
		}

		System.out.println("Enter Password!");
		if(!uid.containsValue(sc.next())) {
			System.out.println("Wrong Password");
			return;
		}

		System.out.println("Login Done!!");


	}

}
