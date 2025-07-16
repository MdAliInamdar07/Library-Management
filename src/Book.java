import java.util.*;
public class Book {
    String bookname , authorname;
    @Override
    public boolean equals(Object object) {
        if (object == null ) return false;

        Book book = (Book) object;
        return java.util.Objects.equals(bookname, book.bookname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookname);
    }

    public Book(String bookname , String authorname ){
        this.bookname = bookname;
        this.authorname = authorname;
    }

    public String toString() {
        return "Name : " + bookname + "Author : " + authorname;
    }
}