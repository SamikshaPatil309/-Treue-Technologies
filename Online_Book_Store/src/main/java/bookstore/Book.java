package bookstore;

import java.util.ArrayList;
import java.util.List;

public class Book {

	
	
	private static final List<Book> Books = null;
	private int bid;
	private String bname;
	private String bauthor;
	private String category;
	private  boolean isAvailable;
	private String ownedBy;
	private double bprice;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public static List<Book> getBooks() {
		return Books;
	}
	
	public Book(int bid, String bname, String bauthor, String category, boolean isAvailable, String ownedBy,
			double bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.category = category;
		this.isAvailable = isAvailable;
		this.ownedBy = ownedBy;
		this.bprice = bprice;
	}
	public static List <Book>getBookList()
	{
		List<Book>books=new ArrayList<>();
		books.add(new Book(0,"Python","Guido Van Rossum","Computer Science",true,null,896));
		books.add(new Book(1,"The Song Of India","Sarojini Naidu","Social",true,null,600));
		books.add(new Book(2,"Cobol","Rajaraman","Computer Science",true,null,489));
		books.add(new Book(3,"Operating System","Dhamdhere","Computer Science",true,null,569));
		books.add(new Book(4,"Advance Java","Ghosh","Computer Science",true,null,859));
		books.add(new Book(5,"Computer Grafics","Bhattachhary","Computer Science",true,null,989));
		books.add(new Book(6,"Logic And prolog Pragramming","Kaushik,saroj","Computer Science",true,null,889));
		
		
		return books;		
		
	}	
	
	

}
