package lab8;

public class ProcessingState implements OrderState {
    @Override
    public void nextState(OrderContext order) {
        order.setState(new ShippedState());
    }

    @Override
    public void cancel(OrderContext order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Processing";
    }
}
