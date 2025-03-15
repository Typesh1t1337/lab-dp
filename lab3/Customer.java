package lab3;

import java.util.*;

public class Customer {
    private String name;

    private Map<Product, EnumSet<NotificationType>> subscriptions = new HashMap<>();

    private Notification notification;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
        this.name = "";
    }

    public void update(String message){
        notification.send(message);
    }

    public void setNotification(Notification notification){
        this.notification = notification;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Product, EnumSet<NotificationType>> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Map<Product, EnumSet<NotificationType>> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribeToProduct(Product product, NotificationType... preferences) {
        product.addSubscribers(this, preferences);
        subscriptions.put(product, EnumSet.copyOf(Arrays.asList(preferences)));
    }

    public void unsubscribeFromProduct(Product product) {
        product.removeSubscribers(this);
        subscriptions.remove(product);
    }

    public void changePreferences(Product product, NotificationType... newPreferences) {
        if (subscriptions.containsKey(product)) {
            product.addSubscribers(this, newPreferences);
            subscriptions.put(product, EnumSet.copyOf(Arrays.asList(newPreferences)));
        }
    }
}
