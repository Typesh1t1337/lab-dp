package lab2;

public class PushNotificationService implements NotificationService{

    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Push notofication" + userId + ":" + message);
    }
}
