package lab8;

public class CancelledState implements OrderState {
    @Override
    public void nextState(OrderContext order) {
        System.out.println("cancelled");
    }

    @Override
    public void cancel(OrderContext order) {
        System.out.println("Order canceled already.");
    }

    @Override
    public String getStatus() {
        return "Cancelled";
    }
}
