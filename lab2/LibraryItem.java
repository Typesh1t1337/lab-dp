package lab2;
import java.util.UUID;

public class LibraryItem {
    protected String id;
    protected String title;
    protected ItemStatus status;

    protected String reservedUser;

    public LibraryItem(String title) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.status = ItemStatus.AVAILABLE;
        this.reservedUser = null;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public boolean reserve(String userName){
        if(this.status == ItemStatus.AVAILABLE){
            this.status = ItemStatus.RESERVED;
            this.reservedUser = userName;
            return true;
        }

        return false;
    }

    public boolean cancelReservation(String userName){
        if(this.status == ItemStatus.RESERVED){
            this.status = ItemStatus.AVAILABLE;
            this.reservedUser = null;
            return true;
        }
        return false;
    }

    public String getReservedUser() {
        return reservedUser;
    }

    public void setReservedUser(String reservedUser) {
        this.reservedUser = reservedUser;
    }
}

enum ItemStatus {
    AVAILABLE, CHECKED_OUT, RESERVED
}