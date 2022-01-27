package study.extrapractics;

public class CmdLineArgument {

	public static void main(String[] args) {
		//loop for command line input
		for(String n:args) {
			System.out.println(n.toUpperCase());//taking args[i] in n and making it upper case
		}

	}

}
