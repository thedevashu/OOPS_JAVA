package study.practice.library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Library {
	TreeSet<Book> book;

	public Library(TreeSet<Book> books) {
		this.book =books;
		// TODO Auto-generated constructor stub
	}
	public void showAllBooksInSortedOrderOfName () 
	{
//		this.book = new TreeSet<>((o1,o2)->{return o1.getBook().compareTo(o2.getBook());}) ;
		TreeSet<Book>temp = new TreeSet<>((o1,o2)->{return o1.getBook().compareTo(o2.getBook());}) ;
		Iterator<Book> it=book.iterator();
		while(it.hasNext()) {
			temp.add(it.next());
		}	
		temp.stream().forEach((e)->{System.out.println(e);});
	}

	public void showAllBooksInSortedOrderOfAuthor() {

//		book = new TreeSet<>((o1,o2)->{return o1.getAuthorName().compareTo(o2.getAuthorName());}) ;
		TreeSet<Book>temp = new TreeSet<>((o1,o2)->{return o1.getAuthorName().compareTo(o2.getAuthorName());}) ;
		Iterator<Book> it=book.iterator();
		while(it.hasNext()) {
			temp.add(it.next());
		}
		temp.stream().forEach((e)->{System.out.println(e);});
	}


	public void display() {
		//		book.stream().forEach((e) -> {System.out.println(e);});
		Iterator<Book> it=book.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
class NameSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBook().compareTo(o2.getBook());
	}

}