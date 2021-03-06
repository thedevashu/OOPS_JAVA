package study.lamdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//Without Lamda notation
		List<Integer> a =Arrays.asList(1,2,3,4,5,6,7,8);
		
		Stream<Integer> str= a.stream();
		str.filter(new MyPre())
		.forEach(new MyConsumer());
		
		
		//With Lamda notation
		System.out.println("----With Lamda notation------");
		List<Integer> aList = Arrays.asList(12,22,8,19,15,34);
//		Stream<Integer> stm =aList.stream();
// 		stm.filter((t)->{if(t>=15) return true;else return false;}).forEach((ele)->{System.out.println(ele);});

 		
 		Stream<Integer> s=aList.stream().map((t)->{ return t=t+1;});
 		aList.forEach((e)->{System.out.println(e);});
 		System.out.println("-----------");
 		s.forEach((e)-> {System.out.println(e);});
	}//end of main method

}//end StreamExample class
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}

class MyPre implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t>5) return true;
		return false;
	}
	
}