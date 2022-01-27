package study2;

import java.util.Scanner;

public class MainLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter user pass");
		String username =sc.next();
		String password =sc.next();
		
		if(username.equals("user") &&password.equals("user")) {
			System.out.println("user login");
		}
		else if(username.equals("admin") && password.equals("admin")) {
			System.out.println("Admin login");
		}
		else {
			System.out.println("INVALID USERNAME AND/OR PASSWORD");
		}
		
		
	}

}
