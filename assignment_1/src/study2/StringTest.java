package study2;

public class StringTest {
	public static void main(String[] args) {
		String s1=new String("Hello");
		System.out.println(s1);
		String s2 = new String();
		s2="Hello";
		System.out.println(s2);
		String s3 = "Hello";
		char carr[] = {'s','4','H','e','l','l','o'};
		
		
		
		String s4 =new String(carr);
		System.out.println(s4);
		
		String s5 =new String(carr,2,4);
		System.out.println(s5);

		if (s3 == s4) {
			System.out.println("Inside String Pools");
		}
	}
}

/*Write a class StringTest  
			write the starting point main
				create 5 string objects using following 4 constructors from Javadocs 	
					String(String )
					String()
					String(char[] )
					String(char[] , offset,count )

				print all the strings
*/