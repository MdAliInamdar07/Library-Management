import java.util.*;
public class LibrarySearchBook extends LibraryDatabase {
    String bookName , authorName;
    public void UserIN(String bookName , String authorName){
        Book bb = new Book(bookName , authorName );
        if(LibraryDatabase.bookMap.containsKey(bb)){
            System.out.println(LibraryDatabase.bookMap.get(bb));
        }
        else {
            System.out.println("Book not found to try again from main menu...");
        }

    }
}