import java.util.ArrayList;
import java.util.List;

//Journal Paper is a type of publication.
public class JournalPaper extends Publication { 

	
	private  String Jauthor, Jpublisher, Jtitle, name, type;
	private  String startingPage, endingPage, Jyear, journalName;
	//private static  totalPage = endingPage- startingPage;
	
	public JournalPaper(String type ,String title, String year, String publisher, String journalName, String startingPage, String endingPage, ArrayList<String> AuthorNames ) {
//Create my journal object and call the super constructor
		super(title, AuthorNames, year, publisher);
		
		this.type = type;
		this.journalName=journalName;
		this.startingPage=startingPage;
		this.endingPage= endingPage;
	}


	@Override
	public String getTitle() {return Jtitle;}

	@Override
	public String getProductionYear() {return Jyear;}


	@Override
	public String getPageNumber() {return (String)endingPage;}
	
	  String getType( ){return type;}


	public String toString(){ //toString for my Journal object
		return ("The type is "+ type +", The title is " + title + ", the year is " + year
				+ ", the publisher is " + publisher + ", the jounral name is "
				+ journalName + ", the starting page is " + startingPage + ", the ending page " + endingPage + ", the authors are " +  AuthorNames.toString());
				}
	
	}
