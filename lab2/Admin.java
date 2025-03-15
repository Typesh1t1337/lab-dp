package lab2;

public class Admin implements User {
    public void manageUsers() {
        System.out.println("manage");
    }

    @Override
    public void reserveBook(LibraryItem item) {

    }

    @Override
    public void receiveNotification(String message) {
        System.out.println("Admin Notification: " + message);
    }
}
