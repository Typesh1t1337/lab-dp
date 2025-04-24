package lab8;

public class DeliveredState implements OrderState {
    @Override
    public void nextState(OrderContext order) {
        System.out.println("Order have been delivered");
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Couldn't cancel!");
    }

    @Override
    public String getStatus() {
        return "Delivered";
    }
}
