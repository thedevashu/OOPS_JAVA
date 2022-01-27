package study.collection;

public class PaletteUser {

	public static void main(String[] args) {
		Palette p =new Palette();
		p.addToColorPalette("Blue");
		p.addToColorPalette("Glue");
		p.addToColorPalette("Rlue");
		p.addToColorPalette("Zlue");
		p.addToColorPalette("Clue");
		p.removeColor("Blue");
		p.showAllColors();
		
		if(p.isColor("Gelue")) System.out.println("Present");
		else System.out.println("Not Present");
//		System.out.println(p);

	}

}
