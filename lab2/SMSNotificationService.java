package lab2;

public class SMSNotificationService implements NotificationService{
    @Override
    public void sendNotification(String userId, String mesaage){
        System.out.println("sending email to" + userId + ":" + mesaage);
    }
}
