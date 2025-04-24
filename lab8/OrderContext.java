package lab8;

public class OrderContext {
    private OrderState currentState;

    public OrderContext() {
        this.currentState = new CreatedState();
    }

    public void setState(OrderState state) {
        this.currentState = state;
    }

    public void nextState() {
        currentState.nextState(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public String getStatus() {
        return currentState.getStatus();
    }
}
