package Assignments;

public class PrivateClass { 
//private class PrivateClass 
//illegal modifier: only public, abstract,final are permitted

	private static void main(String[] args) {
 //allowing but giving warning sign as never used locally
// It compiles successfully without any errors but at the runtime, 
//it says that the main method is not public.
//Error: Main method not found in class Assignments.PrivateClass, please define the main method as:
//   public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application
		
		PrivateClass example = new PrivateClass();
		example.bring_books("Story book");
	}
	
	void bring_books( String book) {
// void bring_books(private String book)		
//illegal modifier for parameter bring_books; only final is permitted	
		System.out.println(book);
	}

}
