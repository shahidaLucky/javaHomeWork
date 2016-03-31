package keywords;

public class Book {
	
	String bookName;
	String ISBN;
	
	//Constructor 1
	public Book(){
		
	}
	
	//Constructor 2
	public Book(String bookName){
		this.bookName = bookName;
		System.out.println(bookName);
	}
	
	//Constructor 3
	public Book(String bookName, String ISBN){
		this.bookName = bookName;
		System.out.println(bookName+"  "+ISBN);
	}
	
	
	public void readBook(){
		System.out.println("Reading science book about space");
	}
	
}
