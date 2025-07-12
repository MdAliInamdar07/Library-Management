import java.util.*;

public class LibraryDatabase {

    public void preLoaded(){
        addBookToDatabase("The Alchemist","Paulo Coelho", 1, 1);
        addBookToDatabase("1984", "George Orwell", 2, 3);
        addBookToDatabase("To Kill a Mockingbird", "Harper Lee", 2, 2);
        addBookToDatabase("Harry Potter and the socerer's stone" , "J.K.Rowling" ,1 , 3  );
        addBookToDatabase("Harry Potter and the chamber of secrets" , "J.K.Rowling" ,2 , 3  );
        addBookToDatabase("Harry Potter and Prisoner of Azkaban" , "J.K.Rowling" ,3 , 3  );
        addBookToDatabase("Harry Potter and Goblet of fire" , "J.K.Rowling" ,4 , 3  );
        addBookToDatabase("Harry Potter and Order of Phoenix" , "J.K.Rowling" ,5 , 3  );
        addBookToDatabase("Harry Potter and the Half Blood Prince" , "J.K.Rowling" ,6 , 3  );
        addBookToDatabase("Harry Potter and Deathly Hallows Part 1" , "J.K.Rowling" ,7 , 3  );
        addBookToDatabase("Harry Potter and Deathly Hallows Part 2" , "J.K.Rowling" ,8 , 3  );
        addBookToDatabase("Atomic Habits" , "James Clear", 1 , 2  );
        addBookToDatabase("Ric Dad Poor Dad" , "Robert Kiyosaki", 2, 5 );
        addBookToDatabase("The Lord of the Rings" , " J. R. R. Tolkien", 1, 4 );
        addBookToDatabase("The Name of the Wind" , "Patrick Rothfuss" ,5, 1 );
        addBookToDatabase("A Game of Thrones" , "George Martin" ,3, 6 );
        addBookToDatabase("Alice In Wonderland" , "Lewis Carroll" ,4, 2 );
        addBookToDatabase("Watership Down" , "Rex Collings" ,7, 2);
        addBookToDatabase("james and the Gaint peach" , "Roald Dahl", 1 ,  7);
        addBookToDatabase("Neverwhere" , "Neil Gaiman" ,5, 9);
        addBookToDatabase("Jade City" , "Fonda Lee" ,9, 2);
    }

    public static HashMap<Book, BookLocation> bookMap = new HashMap<>();

    public void addBookToDatabase(String bookname , String authorname , int shelfNo , int aisleNo){

        Book bb = new Book(bookname , authorname );
        BookLocation bl = new BookLocation(shelfNo, aisleNo);

        LibraryDatabase.bookMap.put(bb,bl);
        System.out.println("Book " + bookname + " by " + authorname + " added to shelf number : " + shelfNo + " and aisle number : " + aisleNo);

    }
}
