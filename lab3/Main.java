package lab3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product someCoolStaff1 = new Product("someCoolStaff1", 2232200.00, true);
        Product someCoolStaff2 = new Product("someCoolStaff2", 340230.00, false);

        Customer druski = new Customer("Druski");
        Customer rizzler = new Customer("Rizller");

        druski.subscribeToProduct(someCoolStaff1, NotificationType.ALTER_PRICE);
        rizzler.subscribeToProduct(someCoolStaff1, NotificationType.ALTER_STOCK);
        rizzler.subscribeToProduct(someCoolStaff2, NotificationType.ALTER_PRICE, NotificationType.ALTER_STOCK);


        someCoolStaff1.setPrice(1100.00);
        someCoolStaff2.setStock(false);
        someCoolStaff2.setStock(true);

        druski.changePreferences(someCoolStaff1, NotificationType.ALTER_PRICE);
        someCoolStaff2.setPrice(1050.00);

        druski.setNotification(new EmailNotification(new BasicNotification("Whats up D?")));
        rizzler.setNotification(new SMSNotification(new EmailNotification(new PremiumMessageDecorator(new BasicNotification("Whassup skibidi Rizzler")))));

        rizzler.unsubscribeFromProduct(someCoolStaff1);
        someCoolStaff1.setPrice(999.99);

        Product.sendAnnouncement("Big Sale on all items!", Arrays.asList(someCoolStaff1, someCoolStaff2));
    }
}

