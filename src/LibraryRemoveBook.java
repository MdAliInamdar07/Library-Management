import java.util.*;
public class LibraryRemoveBook extends LibraryDatabase{
    String bookName , authorName;
    public void UserIN(String bookName , String authorName){
        new Book(bookName, authorName).equals(new Book(bookName, authorName));
        if(LibraryDatabase.bookMap.containsKey(new Book(bookName, authorName))) {
            LibraryDatabase.bookMap.remove(new Book(bookName, authorName));
            System.out.println("Book successfully removed");
        }
        else {
            System.out.println("Book not found to try again from main menu...");
        }
    }
}
