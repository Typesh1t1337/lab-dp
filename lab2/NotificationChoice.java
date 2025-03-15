package lab2;

public class NotificationChoice {
    public static NotificationService getNotificationService(String type) {
        if(type.equals("sms")){
            return new SMSNotificationService();
        }else if(type.equals("push")){
            return new PushNotificationService();
        }else {
            return new EmailNotificationService();
        }
    }
}
