package lab8;

public class CreatedState implements OrderState {
    @Override
    public void nextState(OrderContext order) {
        order.setState(new ProcessingState());
    }

    @Override
    public void cancel(OrderContext order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "Created";
    }
}
