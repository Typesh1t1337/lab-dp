package lab8;

public interface OrderState {
    void nextState(OrderContext order);
    void cancel(OrderContext order);
    String getStatus();
}
