package week2.day2;

public class Library {

	public String addBook(String booktitle) {
		System.out.println("Book added successully");
		return booktitle;
	}
    public void issueBook() {
    	System.out.println("Book issued successfully");
    }
    public static void main(String[] args) {
    	Library library = new Library ();
    	String title = library.addBook("Java fundamentals");
    	System.out.println("Added book " + title);
    	library.issueBook();		
	}
 
}

