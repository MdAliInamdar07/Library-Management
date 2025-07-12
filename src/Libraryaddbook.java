import java.util.*;
    public class Libraryaddbook extends LibraryDatabase{
        Scanner sc = new Scanner(System.in);
        LibraryDatabase ob = new LibraryDatabase();
        public void UserIN(){
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter shelf number: ");
            int shelf = sc.nextInt();
            System.out.print("Enter aisle number: ");
            int aisle = sc.nextInt();
            sc.nextLine(); // consume leftover newlin//
            ob.addBookToDatabase(title , author , shelf , aisle);
        }
}