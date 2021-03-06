package study.collection;



import java.util.Iterator;
import java.util.TreeSet;

public class Palette {
	private TreeSet<String> colors;
	public Palette() {
		colors= new TreeSet<>();
	}
	
	public TreeSet<String> getColors() {
		return colors;
	}

	public void setColors(TreeSet<String> colors) {
		this.colors = colors;
	}

	public void addToColorPalette(String color) {
		this.colors.add(color.toLowerCase());
	}
	
	public void showAllColors() {
//		Iterator<String> it =this.colors.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		this.colors.stream().forEach((e) -> {System.out.println(e);});
	}
	
	public void removeColor(String c) {
		this.colors.remove(c.toLowerCase());
	}
	
	public boolean isColor(String c) {
		return this.colors.contains(c.toLowerCase());
	}
	
	@Override
	public String toString() {
		return "Palette [colors=" + colors + "]";
	}

	public Palette(TreeSet<String> colors) {
		super();
		this.colors = colors;
	}
	

}
