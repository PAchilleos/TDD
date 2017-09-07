package booky;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class BookTest {	
	
		Book testBook1 = new Book (1,"book1","horror","auth1");
		Book testBook2 = new Book (2,"book2","adventure","auth2");
		Book testBook3 = new Book (3,"book3","adventure","auth3");
		Book testBook4 = new Book (4,"book4","horror","auth4");
		Book testBook5 = new Book (5,"book5","adventure","auth5");
		
		ArrayList<Book> Books = new ArrayList<Book>();		
	
	

	@Test
	public void test_addBook() {
		assertEquals(0,Books.size());
		Books.addBooks();  //adds all 5 books
		
		assertEquals(5,Books.size());
	}
	
	@Test
	public void test_addBook() {		
		Book.addBooks();  //adds all 5 books
		Book.filterBooksByGenre("adventure");
		assertEquals(3,Books.size());  //should be 3 adventure books after
		
	}
	
	
	
	

}
