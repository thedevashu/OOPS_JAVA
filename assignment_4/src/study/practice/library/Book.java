package study.practice.library;

public class Book implements Comparable {
	private String book;
	private String authorName;
	public Book(String book,String authorName) {
		this.authorName=authorName;
		this.book=book;
	}
	
	public String toString() {
		return "Book name="+ this.book+", Author name="+ this.authorName+"";
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 1;
	}

	
	
	

}
