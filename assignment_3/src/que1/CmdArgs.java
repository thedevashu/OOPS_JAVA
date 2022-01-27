package que1;

public class CmdArgs {

	public static void main(String[] args) {
		for(String n: args) {
			System.out.println(n.length()+","+n.toUpperCase());
		}
	}

}
