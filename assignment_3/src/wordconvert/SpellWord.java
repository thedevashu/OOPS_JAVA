package wordconvert;

public class SpellWord {

	public String getNumberInWord(String str) {
		String newStr="";
		for(int i=0;i<str.length();i++) {
			newStr+=intoWord(str.charAt(i))+" "+unitsPlace(i,str.length())+" ";
		}
		return newStr;
	}

	

	private String unitsPlace(int i,int length) {
		if(length==2) {
			return "";
		}
		else if(length==3){
		switch (i) {
		case 0:
			
			return "hundred";
		case 1:
			return "";
		default:
			return "";
		}
		}
		else if(length==4){
			switch (i) {
			case 0:
				
				return "thousand";
			case 1:
				return "hundred";
			default:
				return "";
			}
			}
		return "";
	}

	private String intoWord(char charAt) {
		switch (charAt) {
		case '0':
			return "zero";
		case '1':
			return "one";
		case '2':
			return "two";
		case '3':
			return "three";
		case '4':
			return "four";
		case '5':
			return "five";
		case '6':
			return "six";
		case '7':
			return "seven";
		case '8':
			return "eight";
		case '9':
			return "nine";
			

		default:
			return "Error";
		}
		
	}



	

}
