package study5;

public class Stringcount {

	public static void main(String[] args) {
		String s1="11000110011000001110000000011";  
		String str="0" ;
		
		int i=0;
		int j=0;
		while(true) {
			i = s1.indexOf(str);
			
			
			if(i == -1) {
				break;
			}
			str+="0";
		
			j=i;
			
		}
		
		System.out.println(str.substring(0,str.length()-1));
		System.out.println(j);
		
		
		
		
		
		
		
		//		String[] spstr=s1.split("1");  
//		int i=0;
//		int index=0;
//		int max =0;
//		for(String w:spstr){  
//			if(max<spstr[i].length()) {
//				max =spstr[i].length();
//				index =i;
//			}
//			i++;
//		}
//		System.out.println(spstr[index] +" Size:"+max);
//		
//
//
	}
}