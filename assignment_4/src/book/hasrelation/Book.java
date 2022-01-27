package book.hasrelation;

public class Book {

	private String bookName;
	private int cost;
	private String[] authors;
	
	public Book() {
		this.setBookName("");
		this.setCost(00);
		this.setAuthors(null);
	}
	
	public Book(String bookName,int cost,String[] authors) {
		setBookName(bookName);
		setCost(cost);
		setAuthors(authors);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	public String toString() {
		
		return "Name:"+bookName+" Cost"+cost+" "+authrNm();
	}

	public String authrNm() {
		String authrNm="";
		for(int i=0;i<authors.length;i++) {
			authrNm+=authors[i]+",";
		}
		return authrNm;
	}
}
/*  Write a class Book - 
				Properties - bookname, cost, String[] authors 
				Write 2 constructors , getters and setters 
				In the UserOfBook class  - create array few books 
				1. Show all books having single author
				2. Show all books -  bookname and cost
				3. Show total cost of all books In the array
				4. Show only bookname  author1,author2, author…………   for all books
*/