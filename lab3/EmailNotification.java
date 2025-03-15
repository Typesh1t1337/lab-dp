package lab3;

public class EmailNotification extends NotificationDecorator{

    public EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendEmail(message);
    }

    public void sendEmail(String message){
        System.out.println("Kinda sending  an email " + message);
    }

}
