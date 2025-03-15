package lab2;

import java.util.ArrayList;

public class Student  implements  User{
    private String userId;
    private String name;
    private NotificationService notificationService;

    private UserHistory userHistory;

    public Student(String userId, String name,String type) {
        this.userId = userId;
        this.name = name;
        this.notificationService = NotificationChoice.getNotificationService(type);
        this.userHistory = new UserHistory();
    }

    public Student(){
        this.userId = "";
        this.name = "";
        this.notificationService = NotificationChoice.getNotificationService("email");
        this.userHistory = new UserHistory();
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public void borrowBook(LibraryItem item) {
        if(item.getStatus() == ItemStatus.AVAILABLE){
            item.setStatus(ItemStatus.CHECKED_OUT);
            userHistory.addToBorrowedItem(item);
        }
        else{
            System.out.println("Not available to borrow");
        }
   }


    public UserHistory getUserHistory() {
        return userHistory;
    }

    public void returnBook(LibraryItem item) {
        if(item.getStatus() ==ItemStatus.CHECKED_OUT){
            item.setStatus(ItemStatus.AVAILABLE);
            userHistory.addToReturnedItem(item);
        }
    }

    @Override
    public void reserveBook(LibraryItem item) {
        item.setStatus(ItemStatus.RESERVED);
    }


    @Override
    public void receiveNotification(String message) {
       notificationService.sendNotification(this.userId , message);
    }

    public void setNotificationChoice(String type){
        this.notificationService = NotificationChoice.getNotificationService(type);
    }
}
