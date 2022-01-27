package study.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<Integer> arr =new ArrayList<>();
//		arr.add(12);
//		arr.add(14);
//		arr.add(132);
//		arr.add(16);
//		arr.addAll(2,arr);
//		for (Integer i : arr) {
//			System.out.println(i);
//		}
//		/*
		while(true) {
			System.out.println("1. TO POPULATE\n2. TO DISPLAY\n3. TO SUM\n4. TO REMOVE");
			int key =sc.nextInt();
			if(key >4 || key <0)	break;
			switch (key) {
			case 1:{
				populateList(arr);
				break;
			}
			case 2:{
				showlist(arr);
				break;
			}
			case 3:{
				System.out.println(sumall(arr));
				break;
			}
			case 4:{
				System.out.println("Enter index to remove:");
				
				int i =sc.nextInt();
				remove(arr,i);
				break;
			}
			default:
				break;
			}
			
		}//*/

	}

	private static void remove(List<Integer> arr,int index) {
		arr.remove(index);
		
	}

	private static int sumall(List<Integer> arr) {
		int sum=0;
		for (Integer num : arr) {
			sum+=num;
		}
		return sum;
		
	}

	private static void showlist(List<Integer> arr) {
	
		for (Integer n : arr) {
			System.out.println(n);
		}
		
	}

	private static void populateList(List<Integer> arr) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1. to insert\n2. to append");
		int i=sc.nextInt();
		if(i == 1) {
		System.out.println("Enter  element");
		int n =sc.nextInt();
		System.out.println("Enter  index");
		int in =sc.nextInt();
		arr.add(in,n);
		}
		else if( i== 2) {
			System.out.println("Enter element");
			int n =sc.nextInt();
			arr.add(n);
		}
		
	}

}
/*Write a class ArrayListExample
		Main
		Switch case -
			Call populatelist
			Call showlist
			 call sum
			Call remove element
		
		Public static void showList(List<Integer"  list)
		{
			 show all elements in the list
		}
				
		Public static int sumAll(List<Integer>  list) 
		{
			Calculate sum of all integers in the list
		}
			
			
		Public static void populateList(List<Integer> list )
		{
			Ask user whether to insert or append
				1. Insert   ---- ask index and value   and call   add(index,value)
				2. Append  --- call  add(value)
			Go on asking till user enters "no"
		}
			
		Public static void removeElement(List<Integer> list)
		{
			Ask user whether to remove by index or by value
				1. Index    remove(index)
				2. Value   remove(value )
		}
		*/