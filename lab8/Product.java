package lab8;

public class Product implements OrderComponent{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getTotalPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
