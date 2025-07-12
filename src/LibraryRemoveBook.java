import java.util.*;
public class LibraryRemoveBook extends LibraryDatabase{
    String bookName , authorName;
    public void UserIN(String bookName , String authorName){
        LibraryDatabase.bookMap.remove(new Book(bookName , authorName ));
        System.out.println("Book successfully removed");
    }
}
