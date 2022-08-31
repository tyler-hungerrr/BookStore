public class Book {
	private String title;
	private String author; 
	private int isbn;
	private String publisher;
	private String type;
	
	public Book(String title, int isbn) {
	this.title = title;
	this.isbn = isbn;
	author = "John Smith";
	publisher = "Disney";
	type = "Horror";
	}
	
	public String getTitle() {
		return title;
	}
	
	public int ISBN() {
		return isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getType() {
		return type;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		//determines if two book objects are equal
		if(obj instanceof Book) {
			Book anotherG= (Book) obj;
			if(this.isbn==anotherG.isbn) return true;
			else return false;
		}		
		else return false;
	}
	
	@Override
	public String toString() {
		return title+"_"+isbn+"_"+author+"_"+publisher+"_"+type;
	}
}
