package lab3;

public class PremiumMessageDecorator extends NotificationDecorator {
    public PremiumMessageDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
    }

    private String formatPremiumMessage(String message) {
        return "premium message: " + message;
    }

}
