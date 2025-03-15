package lab2;


public class Reservation {
    public String userId;
    public LibraryItem item;

    public String reservationDate;

    public Reservation(String userId, LibraryItem item,String reservationDate) {
        this.userId = userId;
        this.item = item;
        this.reservationDate = reservationDate;
        item.setStatus(ItemStatus.RESERVED);
    }

    public void cancelReservation(){
        item.setStatus(ItemStatus.AVAILABLE);
    }


}
