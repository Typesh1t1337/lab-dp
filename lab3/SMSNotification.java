package lab3;

public class SMSNotification extends NotificationDecorator {
        public SMSNotification(Notification notification) {
            super(notification);
        }

        @Override
        public void send(String message) {
            super.send(message);
            sendSMS(message);
        }

        private void sendSMS(String message) {
            System.out.println("SMS: " + message);
        }
}
