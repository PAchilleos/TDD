package booky;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class BookTest {	
	
		BookRun testRun = new BookRun();
		
		ArrayList<Book> Books = new ArrayList<Book>();		
	
	

	@Test
	public void test_addBook() {
		assertEquals(0,Books.size());
		testRun.addBooks(Books);  //adds all 5 books
		
		assertEquals(5,Books.size());
	}
	
	@Test
	public void test_filter() {		
		testRun.addBooks(Books);  //adds all 5 books
		testRun.filterBooksByGenre(Books,"adventure");		
		assertEquals(3,Books.size());  //should be 3 adventure books after		
	}
	
	
	
	

}
