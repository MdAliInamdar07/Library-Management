import java.util.*;
public class Book {
    String bookname , authorname;
    public Book(String bookname , String authorname ){
        this.bookname = bookname;
        this.authorname = authorname;
    }

    public String toString() {
        return "Name : " + bookname + "Author : " + authorname;
    }
}