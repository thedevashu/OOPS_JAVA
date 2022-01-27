package que1;

public class TestWrapperClass {

	public static void main(String[] args) {
//		Integer i1 =new Integer(33);
//		Integer i2 =new Integer(33);
//
//		if(i1 == i2) {
//			System.out.println("Same");
//		}
		
		
		
		Integer x =22; //Autoboxing --> Integer x =new Integer(22);
		Integer y =33;
		System.out.println(x +","+y); // Autounboxing --> x.intValue();
		swap(x,y);
		System.out.println(x+","+y);
		
		MyInt x1 =new MyInt();
		MyInt y1 =new MyInt();
		
		x1.val =44;
		y1.val =55;
		
		System.out.println(x1.val+","+y1.val);
		swapMyInt(x1,y1);
		System.out.println(x1.val+","+y1.val);
	}

	private static void swapMyInt(MyInt x1, MyInt y1) {
		MyInt temp =new MyInt();
		temp.val =x1.val;
		x1.val =y1.val;
		y1.val=temp.val;
		
		
	}

	private static void swap(Integer x, Integer y) {
		Integer temp =x;
		x=y;
		y=temp;
		
	}

}

class MyInt{
	int val;
	
	
}
/*public class TestWrapperClass4 {

	
	public static void main(String[] args) {
		
		//Integer x = 33;
		MyWrapper y = new MyWrapper();
		y.value = 33;
		System.out.println(y.value);
		increment(y);
		System.out.println(y.value);
	}
	
	public static void increment(Integer x)
	{
		x=x+1; //boxing + autoboxing
	}
	
	public static void increment(MyWrapper y)
	{
		y.value = y.value +1;
	}
}


class MyWrapper
{
	int value;
}

	
  --- write a swap function that will accept 2 numbers and swap their values 
	Print before and after  in main 
	
	Public static void swap( ……..  V1, …………..v2) 
	
	Draw memory diagrams !!!!
*/