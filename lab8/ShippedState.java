package lab8;

public class ShippedState implements OrderState {
    @Override
    public void nextState(OrderContext order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Cannot cancel. Order already shipped.");
    }

    @Override
    public String getStatus() {
        return "Shipped";
    }
}
