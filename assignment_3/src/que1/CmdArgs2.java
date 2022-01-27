package que1;

public class CmdArgs2 {

	public static void main(String[] args) {
		switch (Integer.parseInt(args[0])){
		case 1:{
			for(int i=2;i<=100;i++) {
				for(int j=1;j<=10;j++) {
					System.out.print(i+" x "+ j+" = "+i*j+"\n");
				}

			}
			break;
		}
		case 2:{
			System.out.println("POEM");
			break;
			
		}
		case 3:{
			System.out.println("MESSAGE FOR YOU");
			break;
		}
		
		default: {
			System.out.println("INVALID ENTERY");
			break;
		}
		}

	}

}
/*Accept one command line argument that is an option 1  or 2 or 3
	If the option is 1  show  table of 2 upto 100
	If the option is 2 show a poem
	If the option is 3 show a message to the user
	If the option is not given or it is other than 1,2,3---- show incorrect option
 */