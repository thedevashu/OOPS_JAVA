package wordconvert;

public class Main {

	public static void main(String[] args) {
		Main m =new Main();
		m.name();
		if(Integer.parseInt(args[0]) < 10001) {
			SpellWord spell =new SpellWord();
			String word = spell.getNumberInWord(args[0]);
			
			System.out.println(word);
		}
		else {
			System.out.println("INVALID ENTRY");
		}

	}
	
	private void name() {
		System.out.println("NAme");

	}

}
