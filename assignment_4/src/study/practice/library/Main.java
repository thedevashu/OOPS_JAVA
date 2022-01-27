package study.practice.library;


import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> books =new TreeSet<>();
		books.add(new Book("A", "Z"));
		books.add(new Book("B", "Y"));
		books.add(new Book("C", "X"));
		books.add(new Book("D", "W"));
		books.add(new Book("E", "V"));
//		books.stream().forEach((e) -> {System.out.println(e);});
		Library lb =new Library(books);
		lb.showAllBooksInSortedOrderOfName();
		System.out.println("--------------------");
		lb.showAllBooksInSortedOrderOfAuthor();
//		lb.display();
	}
}
