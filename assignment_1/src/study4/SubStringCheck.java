package study4;

public class SubStringCheck {

	public static void main(String[] args) {
		String s="1111111111000011111111";
		int i =s.indexOf('0');
		int j= s.lastIndexOf('0');
		String s2 =s.substring(i, j+1);
		System.out.println(s2+ ","+i+","+j);
	}

}
