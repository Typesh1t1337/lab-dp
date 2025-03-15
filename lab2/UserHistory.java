package lab2;
import java.util.*;

public class UserHistory {
    private List<LibraryItem> borrowedItems;
    private List<LibraryItem> returnedItems;



    public UserHistory() {
        this.borrowedItems = new ArrayList<>();
        this.returnedItems = new ArrayList<>();
    }

    public void addToBorrowedItem(LibraryItem item){
        this.borrowedItems.add(item);
    }

    public void addToReturnedItem(LibraryItem item){
        this.borrowedItems.add(item);
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public List<LibraryItem> getReturnedItems() {
        return returnedItems;
    }
}
