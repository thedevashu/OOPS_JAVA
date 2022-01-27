/**
 * 
 */
package que1;


public class CmdArgs3 {

	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (String n : args) {
			sum +=Integer.parseInt(n);
		}
		System.out.println(sum);
		
		}

}
