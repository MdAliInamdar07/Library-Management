import java.util.*;
public class BookLocation {

    public int shelfNumber , aisleNumber;

        public BookLocation( int shelfNumber, int aisleNumber){
            this.shelfNumber = shelfNumber;
            this.aisleNumber = aisleNumber;
        }
        public String toString () {
            return "Shelf Number " + shelfNumber + " Asile Number " + aisleNumber;
        }
    }
