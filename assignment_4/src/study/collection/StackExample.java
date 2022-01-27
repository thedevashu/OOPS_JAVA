package study.collection;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		List<Integer> stk =new Stack<>();
		
//		stk.push(23);
//		System.out.println(stk.peek());
		List<Integer> x =Arrays.asList(1,2,3,5,7,8,9);
		Iterator< Integer> itr=x.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("----");
		
//		Enumeration<Integer> enumr =Collections.enumeration(x);
		Enumeration<Integer> enumr =Collections.enumeration(x);
		while(enumr.hasMoreElements()) {
			System.out.println(enumr.nextElement());
		}
		List<Integer> v =new Vector<>();
		v.add(12);
		v.add(12);
		v.add(23);
		
		Iterator<Integer> it =v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("---------");
		for (Integer i : v) {
			System.out.println(i);
		}
		
		System.out.println("---------");
		List<String> arr =Arrays.asList("sad","ecf","wef");
		Enumeration<String> e =Collections.enumeration(arr);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
