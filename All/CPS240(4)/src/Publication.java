//William Horst. I tried my best. 10/9/2015. My Publication class. Boooks and journal papaers are publications

import java.util.ArrayList;
import java.util.List;


public abstract class Publication implements Document{

	//getTitle, getYear, getAuthors and getPublisher, getPageNumbers
	ArrayList<String> AuthorNames = new ArrayList<String>();
	//List auth = new ArrayList();
	 String publisher;
	protected  String title;
	protected  String authors;
	protected  String year;
	protected String type;
	
	public Publication(String title, ArrayList<String> AuthorNames, String year, String publisher){ //Create a publication constructor
		this.publisher = publisher;
		this.title = title;
		this.AuthorNames=AuthorNames;
		this.year = year;
		
	}


		
	 String getTitle(String title){ //Get title abstract.
			return title;}
	 
	  String getYear(){return year;}//Get year abstract.
	 
	  ArrayList getAuthors( ){return AuthorNames;} //An ArrayList of Authors

	 
	  String getPublisher(String publisher){return publisher;}
	
	 abstract String getPageNumber();


	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 
}