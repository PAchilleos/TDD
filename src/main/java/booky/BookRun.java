package booky;

import java.util.ArrayList;

public class BookRun {
	

	Book testBook1 = new Book (1,"book1","horror","auth1");
	Book testBook2 = new Book (2,"book2","adventure","auth2");
	Book testBook3 = new Book (3,"book3","adventure","auth3");
	Book testBook4 = new Book (4,"book4","horror","auth4");
	Book testBook5 = new Book (5,"book5","adventure","auth5");
	
	public ArrayList<Book> addBooks(ArrayList<Book> A){
		A.add(testBook1);
		A.add(testBook2);
		A.add(testBook3);
		A.add(testBook4);
		A.add(testBook5);
		return A;		
	}
	
	public ArrayList<Book> filterBooksByGenre(ArrayList<Book> A, String s){
		
		for(int i=0;i<A.size();i++){
			if (!(A.get(i).getGenre() == s)){
				A.remove(i);
			}
		}
		
		return A;		
	}

}
