import java.util.*;
public class BookLocation {
    private int shelfNumber;
    private int aisleNumber;

    public BookLocation(int shelfNumber, int aisleNumber) {
        this.shelfNumber = shelfNumber;
        this.aisleNumber = aisleNumber;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public int getAisleNumber() {
        return aisleNumber;
    }

    public String toString() {
        return "Shelf: " + shelfNumber + ", Aisle: " + aisleNumber;
    }
}
