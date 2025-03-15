package lab2;

public class Librarian implements User {
    private String userId;
    private String name;
    private NotificationService notificationService;

    private UserHistory userHistory;

    public Librarian(String userId, String name, String type, UserHistory userHistory) {
        this.userId = userId;
        this.name = name;
        this.notificationService = NotificationChoice.getNotificationService(type);
        this.userHistory = userHistory;
    }

    public Librarian(){
        this.userId = "";
        this.name = "";
        this.notificationService = NotificationChoice.getNotificationService("email");
        this.userHistory = new UserHistory();
    }

    public void addBook(Storage storage, LibraryItem item) {
        storage.save(item);
    }

    public void removeBook(Storage storage, String itemId) {
        storage.delete(itemId);
    }

    @Override
    public void reserveBook(LibraryItem item) {
        item.setStatus(ItemStatus.RESERVED);
    }


    public String getUserId() {
        return userId;
    }

    @Override
    public void receiveNotification(String message) {
        notificationService.sendNotification(this.userId, message);
    }
}
