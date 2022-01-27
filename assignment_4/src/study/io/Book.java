package study.io;

import java.io.Serializable;

import study.collection.MyDate3;

public class Book implements Serializable {
	private String name, authorName;
	private int cost;
	private MyDate3 dateOfPub;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public MyDate3 getDateOfPub() {
		return dateOfPub;
	}


	public void setDateOfPub(MyDate3 dateOfPub) {
		this.dateOfPub = dateOfPub;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", authorName=" + authorName + ", cost=" + cost + ", dateOfPub=" + dateOfPub
				+ "]";
	}


	/**
	 * @param name
	 * @param authorName
	 * @param cost
	 * @param dateOfPub
	 */
	public Book(String name, String authorName, int cost, MyDate3 dateOfPub) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.cost = cost;
		this.dateOfPub = dateOfPub;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}

}
