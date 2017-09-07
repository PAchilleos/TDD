package booky;

public class Book {
	
	private int ID;
	private String name;
	private String genre;
	private String author;
	
	
	public Book(int iD, String name, String genre, String author) {
		super();
		ID = iD;
		this.name = name;
		this.genre = genre;
		this.author = author;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	

}
