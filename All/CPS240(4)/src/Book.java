import java.util.ArrayList;
import java.util.List;

//Book is a type of publication.

public class Book extends Publication {

	
	

	String ISBN;
	String Byear;
	String pages;
	String price,type;
	
	
	
	
//Create a book object
	public Book(String type, String title, String year, String publisher, String ISBN, String price, String pages, ArrayList<String> AuthorNames) {
		super(title, AuthorNames, year, publisher);
		this.price = price;
		this.pages = pages;
		this.ISBN = ISBN;
		this.type=type;
	
	
	}
	
	
	public String toString(){ //To string for my book
		return ("The type is " + type +", The title is " + this.title + ", the date is " + this.year
				+ ", the publisher is " + this.publisher + ", the isbn is "
				+ ISBN + ", the Price is " + price + ", the pages is " + pages+ ", the authors are "+ AuthorNames);
				}
	
	@Override
	public  String getProductionYear() {return Byear;}

	@Override
	public   String getPageNumber() {return pages;}

	@Override
	public String getTitle() {return title;}

	  String getType( ){return type;}





	
}
