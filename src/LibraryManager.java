import java.util.*;
public class LibraryManager extends Libraryaddbook{
    public void libMenu() {
        Scanner sc = new Scanner(System.in);
        LibraryDatabase ld = new LibraryDatabase();
        ld.preLoaded();
        int choice;
        String title , author;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Check Book Status");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    Libraryaddbook ob = new Libraryaddbook();
                    ob.UserIN();
                    //System.out.println("The book has been added successfully");
                    break;
                case 2:
                    System.out.print("To remove the book \n Enter title: ");
                    title = sc.nextLine();
                    System.out.println();
                    System.out.print("Enter author: ");
                    author = sc.nextLine();
                    LibraryRemoveBook rb = new LibraryRemoveBook();
                    rb.UserIN(title , author);
                    break;
                case 3:
                    System.out.print("To Search for a book \n Enter title: ");
                    title = sc.nextLine();
                    System.out.println();
                    System.out.print("Enter author: ");
                    author = sc.nextLine();
                    LibrarySearchBook sb = new LibrarySearchBook();
                    sb.UserIN(title , author);
                    break;
                case 4:
                    for(Map.Entry<Book, BookLocation>e : bookMap.entrySet()) {
                        System.out.println(e.getKey());
                        System.out.println(e.getValue());
                    }
                    break;
                case 5:
                    System.out.print("To borrow a book \n Enter title: ");
                    title = sc.nextLine();
                    

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
