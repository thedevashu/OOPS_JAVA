package book.hasrelation;

import java.util.Scanner;

public class MainBookUser {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of books");
		int size =sc.nextInt();
		Book bookArr[] =new Book[size];
		
		
		populateBook(bookArr,sc);
		oneAuth(bookArr);
		bkNameAuthName(bookArr);
		bkNamePrice(bookArr);
		for(int i=0;i<bookArr.length;i++) {
			System.out.println(bookArr[i]);
		}
		

	}


	private static void bkNamePrice(Book[] bookArr) {
		for (int i = 0; i < bookArr.length; i++) {
			System.out.println(bookArr[i].getBookName()+"-->Price:"+bookArr[i].getCost());
		}
		
	}


	private static void populateBook(Book[] bookArr, Scanner sc) {
		for(int i=0;i<bookArr.length;i++) {
			System.out.println("Enter name of book number"+i);
			String bName=sc.next();
			
			
			System.out.println("Enter cost of book number"+i);
			int bCost=sc.nextInt();
			System.out.println("Enter number of Authors for book "+bName);
			int noOfAuthors =sc.nextInt();
			String authorNames[] =authorNames(noOfAuthors,sc);
			
			bookArr[i] =new Book(bName,bCost,authorNames);
			
		}
		
	}


	private static void bkNameAuthName(Book[] bookArr) {
		for(int i=0;i<bookArr.length;i++) {
			System.out.println(bookArr[i].getBookName()+ "-->"+bookArr[i].authrNm());
		}
		
	}


	private static void oneAuth(Book[] bookArr) {
		for(int i=0;i<bookArr.length;i++) {
			if(bookArr[i].getAuthors().length == 1) {
				System.out.println(bookArr[i]);
			}
		}
		
	}


	private static String[] authorNames(int n,Scanner scn) {
		String[] temp =new String[n];
		for(int i=0;i<temp.length;i++) {
			System.out.println("Enter Author name");
			temp[i] =scn.next();
			
		}
		return temp;
	}

}
