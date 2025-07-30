package week2.day2;

public class LibraryManagement {

		public static void main(String[] args) {
			Library library = new Library();
			String addedBook = library.addBook("Effective Java");
			System.out.println("Book title Returned " + addedBook);
			library.issueBook();
			
		}
		
	}

