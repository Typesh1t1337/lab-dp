package lab3;

import java.util.*;

public class Product {
    private String name;
    private double price;

    private boolean isStock;

    private Map<Customer, EnumSet<NotificationType>> subscribers = new HashMap<>();


    public Product(String name, double price, boolean isStock) {
        this.name = name;
        this.price = price;
        this.isStock = isStock;
    }

    public Product() {
        this.name = "";
        this.price = 0.0;
        this.isStock = false;
    }


    public void addSubscribers(Customer customer, NotificationType[] preferences) {
        subscribers.put(customer, EnumSet.copyOf(Arrays.asList(preferences)));
    }

    public void removeSubscribers(Customer customer){
        subscribers.remove(customer);
    }

    public void notifySubscribers(String message, NotificationType type){
        for(Map.Entry<Customer,EnumSet<NotificationType>> entry: subscribers.entrySet()){
            if(entry.getValue().contains(type)){
                entry.getKey().update(message);
            }
        }
    }

    public static void sendAnnouncement(String message, List<Product> products){
        Set<Customer> productCustomers = new HashSet<>();

        for(Product product : products) {
            productCustomers.addAll(product.subscribers.keySet());
        }

        for(Customer customer : productCustomers) {
            customer.update(message);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    public Map<Customer, EnumSet<NotificationType>> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Map<Customer, EnumSet<NotificationType>> subscribers) {
        this.subscribers = subscribers;
    }



}
